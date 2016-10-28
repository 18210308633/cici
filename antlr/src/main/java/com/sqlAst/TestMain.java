package com.sqlAst;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sqlBase.gen.SqlLexer;
import sqlBase.gen.SqlParser;

/**
 * Created by rensong.pu on 2016/10/26.
 */
public class TestMain {
    public static void main(String[] args) {
        String sql = "select * from A as a  where a . xx = XX";
        /**
         * ==============================
         *   构建sql AST
         *
         * ==============================
         */
        // 1.词法分析
        ANTLRInputStream input = new ANTLRInputStream(sql);
        SqlLexer sqlLexer = new SqlLexer(input);
        //2.语法分析
        CommonTokenStream commonTokenStream = new CommonTokenStream(sqlLexer);
        SqlParser sqlParser = new SqlParser(commonTokenStream); //Sql.g4生成的parser,方法名对应配置文件中的rule

        SqlParser.QueryContext queryContext = sqlParser.query();//获取主查询语句

        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new MyParseTreeListener();
        walker.walk(listener, queryContext);

        MyParseTreeVisitor treeVisitor = new MyParseTreeVisitor();
        Object o =  treeVisitor.visit(queryContext);
        System.out.println("= 的内容->"+o.toString());

        System.out.println("sql=>" + SqlAstUtil.astToSql(queryContext));



    }
}
