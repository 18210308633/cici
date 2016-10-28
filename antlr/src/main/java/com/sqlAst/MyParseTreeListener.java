package com.sqlAst;

import sqlBase.gen.SqlBaseListener;
import sqlBase.gen.SqlParser;

/**
 * Antlr4 提供的第一种遍历语法树的方法（default）
 * 选择重载父类SqlBaseListener中的方法完成翻译
 * Created by rensong.pu on 2016/10/26.
 */
public class MyParseTreeListener extends SqlBaseListener {

    @Override
    public void enterQuery(SqlParser.QueryContext ctx) {

    }
}
