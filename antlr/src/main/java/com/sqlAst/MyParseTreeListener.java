package com.sqlAst;

import sqlBase.gen.SqlBaseListener;
import sqlBase.gen.SqlParser;

import java.util.HashSet;
import java.util.Set;

/**
 * Antlr4 提供的第一种遍历语法树的方法（default）
 * 选择重载父类SqlBaseListener中的方法完成翻译
 * Created by rensong.pu on 2016/10/26.
 */
public class MyParseTreeListener extends SqlBaseListener {

    private Set<String> tableNames = new HashSet<>();

    @Override
    public void enterQuery(SqlParser.QueryContext ctx) {
    }

    @Override
    public void enterTableName(SqlParser.TableNameContext ctx) {
        tableNames.add(ctx.getText());
    }

    public Set<String> getTableNames() {
        return tableNames;
    }
}
