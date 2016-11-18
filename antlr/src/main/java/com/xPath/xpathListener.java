// Generated from E:/work_space/LeetCode/cici/antlr/java/xPath\xpath.g4 by ANTLR 4.5.3
package com.xPath;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xpathParser}.
 */
public interface xpathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterXpath(xpathParser.XpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitXpath(xpathParser.XpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#enclosedExpr}.
	 * @param ctx the parse tree
	 */
	void enterEnclosedExpr(xpathParser.EnclosedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#enclosedExpr}.
	 * @param ctx the parse tree
	 */
	void exitEnclosedExpr(xpathParser.EnclosedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(xpathParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(xpathParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void enterExprSingle(xpathParser.ExprSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void exitExprSingle(xpathParser.ExprSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void enterForExpr(xpathParser.ForExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void exitForExpr(xpathParser.ForExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#simpleForClause}.
	 * @param ctx the parse tree
	 */
	void enterSimpleForClause(xpathParser.SimpleForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#simpleForClause}.
	 * @param ctx the parse tree
	 */
	void exitSimpleForClause(xpathParser.SimpleForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#simpleForBinding}.
	 * @param ctx the parse tree
	 */
	void enterSimpleForBinding(xpathParser.SimpleForBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#simpleForBinding}.
	 * @param ctx the parse tree
	 */
	void exitSimpleForBinding(xpathParser.SimpleForBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void enterLetExpr(xpathParser.LetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void exitLetExpr(xpathParser.LetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#simpleLetClause}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLetClause(xpathParser.SimpleLetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#simpleLetClause}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLetClause(xpathParser.SimpleLetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#simpleLetBinding}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLetBinding(xpathParser.SimpleLetBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#simpleLetBinding}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLetBinding(xpathParser.SimpleLetBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#quantifiedExpr}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedExpr(xpathParser.QuantifiedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#quantifiedExpr}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedExpr(xpathParser.QuantifiedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(xpathParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(xpathParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#forwardAxis}.
	 * @param ctx the parse tree
	 */
	void enterForwardAxis(xpathParser.ForwardAxisContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#forwardAxis}.
	 * @param ctx the parse tree
	 */
	void exitForwardAxis(xpathParser.ForwardAxisContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(xpathParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(xpathParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#eQName}.
	 * @param ctx the parse tree
	 */
	void enterEQName(xpathParser.EQNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#eQName}.
	 * @param ctx the parse tree
	 */
	void exitEQName(xpathParser.EQNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#uRIQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterURIQualifiedName(xpathParser.URIQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#uRIQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitURIQualifiedName(xpathParser.URIQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#bracedURILiteral}.
	 * @param ctx the parse tree
	 */
	void enterBracedURILiteral(xpathParser.BracedURILiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#bracedURILiteral}.
	 * @param ctx the parse tree
	 */
	void exitBracedURILiteral(xpathParser.BracedURILiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#nCName}.
	 * @param ctx the parse tree
	 */
	void enterNCName(xpathParser.NCNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#nCName}.
	 * @param ctx the parse tree
	 */
	void exitNCName(xpathParser.NCNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#nCNameChar}.
	 * @param ctx the parse tree
	 */
	void enterNCNameChar(xpathParser.NCNameCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#nCNameChar}.
	 * @param ctx the parse tree
	 */
	void exitNCNameChar(xpathParser.NCNameCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#nCNameStartChar}.
	 * @param ctx the parse tree
	 */
	void enterNCNameStartChar(xpathParser.NCNameStartCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#nCNameStartChar}.
	 * @param ctx the parse tree
	 */
	void exitNCNameStartChar(xpathParser.NCNameStartCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#qName}.
	 * @param ctx the parse tree
	 */
	void enterQName(xpathParser.QNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#qName}.
	 * @param ctx the parse tree
	 */
	void exitQName(xpathParser.QNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(xpathParser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(xpathParser.PrefixedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#unprefixedName}.
	 * @param ctx the parse tree
	 */
	void enterUnprefixedName(xpathParser.UnprefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#unprefixedName}.
	 * @param ctx the parse tree
	 */
	void exitUnprefixedName(xpathParser.UnprefixedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(xpathParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(xpathParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link xpathParser#localPart}.
	 * @param ctx the parse tree
	 */
	void enterLocalPart(xpathParser.LocalPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link xpathParser#localPart}.
	 * @param ctx the parse tree
	 */
	void exitLocalPart(xpathParser.LocalPartContext ctx);
}