package sqlBase.sqlDesign;


import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sqlBase.gen.SqlBaseListener;
import sqlBase.gen.SqlBaseVisitor;
import sqlBase.gen.SqlParser;

import java.util.ArrayList;
import java.util.List;

/**
 * SQL视图替换
 * Created by jian.sun on 2016/9/26.
 */
public class SqlViewDesign extends SqlDesign {

    private ParseTreeListener listener;

    public SqlViewDesign(String sourceTableA, String sourceTableB, String targetTable) {
        listener = new ViewDesignListener(sourceTableA, sourceTableB, targetTable);
    }

    @Override
    public String filter(String sql) {
        SqlParser parser = AntlrHelper.getParser(sql);
        SqlParser.QueryContext tree = parser.query();

        new ParseTreeWalker().walk(listener, tree);
        return AntlrHelper.toSql(tree);
    }

}

class ViewDesignListener extends SqlBaseListener {
    private String tableA;
    private String tableB;
    private String viewC;
//    private ComboPooledDataSource metaDB;

    public ViewDesignListener(String tableA, String tableB, String viewC) {
        this.tableA = tableA;
        this.tableB = tableB;
        this.viewC = viewC;
    }

    public ViewDesignListener() {
    }

    private static final Logger logger = LoggerFactory.getLogger(ViewDesignListener.class);

    @Override
    public void enterQuerySpecification(SqlParser.QuerySpecificationContext ctx) {
        if (ctx != null) {
            logger.info("joinrelation->" + ctx.relation(0).getText());
            ViewDesignvistor designvistor = new ViewDesignvistor();
            designvistor.visit(ctx.relation(0));
            for (SqlParser.PredicatedContext context : designvistor.getPredicateds()) {
                String field = context.valueExpression().getText();
                logger.info("filed=>" + field);
            }
        }
        super.enterQuerySpecification(ctx);
    }


//    public boolean isConditionExist() {
//        if (tableA == null || tableB == null) {
//            return false;
//        }
//        QueryRunner queryRunner = new QueryRunner(metaDB);
//        try {
//            List<Map<String, Object>> list = queryRunner.query("select * from va_view_replace_conf where source_a_table='" + tableA + "' and source_b_table='" + tableB + "'"
//                    , new MapListHandler()
//                                                              );
//            if (list.size() > 0) {
//                //存在
//                for (Map mp : list) {
//                    viewC = mp.get("view_table").toString();
//                }
//                return true;
//            }
//        } catch (SQLException e) {
//            logger.error("", e);
//        }
//        return false;
//    }

//    public ComboPooledDataSource getMetaDB() {
//        return metaDB;
//    }

//    public void setMetaDB(ComboPooledDataSource metaDB) {
//        this.metaDB = metaDB;
//    }
}

/**
 * 收集符合配置表的and谓语
 */
class ViewDesignvistor extends SqlBaseVisitor<List<SqlParser.PredicatedContext>> {

    private List<SqlParser.PredicatedContext> predicateds = new ArrayList();

    //    @Override
//    public List<SqlBaseParser.PredicatedContext> visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx) {
//        if ("join".equalsIgnoreCase(ctx.getText())) {
//            visitChildren(ctx);
//        }
//        return predicateds;
//    }
//
//    @Override
//    public List<SqlBaseParser.PredicatedContext> visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx) {
//        if ("join".equalsIgnoreCase(ctx.getText())) {
//            visitChildren(ctx);
//        }
//        return predicateds;
//    }
//
    @Override
    public List<SqlParser.PredicatedContext> visitPredicated(SqlParser.PredicatedContext ctx) {
        if (ctx != null) {
            predicateds.add(ctx);
        } else {
            visitChildren(ctx);
        }
        return predicateds;
    }

    @Override
    public List<SqlParser.PredicatedContext> visitJoinRelation(SqlParser.JoinRelationContext ctx) {
        if ("join".equalsIgnoreCase(ctx.getText())) {
            visitChildren(ctx);
        }
        return predicateds;
    }

    public List<SqlParser.PredicatedContext> getPredicateds() {
        return predicateds;
    }
}
