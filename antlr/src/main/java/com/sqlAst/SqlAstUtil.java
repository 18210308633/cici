package com.sqlAst;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import sqlBase.gen.SqlBaseListener;
import sqlBase.gen.SqlLexer;
import sqlBase.gen.SqlParser;

/**
 * Created by rensong.pu on 2016/10/26.
 */
public class SqlAstUtil {
    /**
     * 字段上浮
     *
     * @param current 传入的节点
     * @param target  上浮的目标节点类型
     * @param <T>
     * @return
     */
    public static <T extends RuleContext> T up(RuleContext current, Class<T> target) {
        while (current != null) {
            current = current.getParent();
            if (target.isInstance(current)) {
                return (T) current;
            }
        }
        return null;
    }

    /**
     * sql语句构建sql 抽象语法树
     *
     * @param sql sql语句
     * @return
     */
    public static SqlParser sqlToAST(String sql) {
        ANTLRInputStream input = new ANTLRInputStream(sql);
        SqlLexer sqlLexer = new SqlLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(sqlLexer);
        SqlParser sqlParser = new SqlParser(commonTokenStream);
        return sqlParser;
    }

    /**
     * 抽象语法树->Sql语句 添加上空格
     *
     * @param tree sql AST
     * @return
     */
    public static String astToSql(ParseTree tree) {
        BlankSqlListener sqlBaseListener = new BlankSqlListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(sqlBaseListener, tree);
        return sqlBaseListener.getSql();
    }

    static class BlankSqlListener extends SqlBaseListener {

        private StringBuilder sqlSentence;

        public BlankSqlListener() {
            sqlSentence = new StringBuilder();
        }

        @Override
        public void visitTerminal(TerminalNode node) {
            sqlSentence.append(node.getText()).append(" ");
        }

        public String getSql() {
            return sqlSentence.toString();
        }
    }
}
