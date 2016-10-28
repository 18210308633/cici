// Generated from E:/work_space/LeetCode/cici/antlr/java/javaCode\SomeLanguage.g4 by ANTLR 4.5.3
package someLanguage.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SomeLanguageParser}.
 */
public interface SomeLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SomeLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SomeLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(SomeLanguageParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(SomeLanguageParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(SomeLanguageParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(SomeLanguageParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(SomeLanguageParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(SomeLanguageParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SomeLanguageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SomeLanguageParser.InstructionContext ctx);
}