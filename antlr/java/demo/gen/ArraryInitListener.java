// Generated from E:/work_space/LeetCode/cici/antlr/java/demo\ArraryInit.g4 by ANTLR 4.5.1
package demo.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArraryInitParser}.
 */
public interface ArraryInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArraryInitParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(ArraryInitParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArraryInitParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(ArraryInitParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArraryInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ArraryInitParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArraryInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ArraryInitParser.ValueContext ctx);
}