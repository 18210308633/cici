package com.sqlAst;

import sqlBase.gen.SqlBaseVisitor;
import sqlBase.gen.SqlParser;

/**
 * Created by rensong.pu on 2016/10/26.
 */
public class MyParseTreeVisitor extends SqlBaseVisitor{
    @Override
    public Object visitWith(SqlParser.WithContext ctx) {
        return super.visitWith(ctx);
    }

    @Override
    public Object visitBooleanDefault(SqlParser.BooleanDefaultContext ctx) {
        return super.visitBooleanDefault(ctx);
    }

    @Override
    public Object visitComparison(SqlParser.ComparisonContext ctx) {
        if(ctx.comparisonOperator().getText().equalsIgnoreCase("=")){
            return ctx.valueExpression().getText();
        }
        return null;
    }
}
