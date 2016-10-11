// Generated from E:/work_space/LeetCode/cici/antlr/java/demo\ArraryInit.g4 by ANTLR 4.5.1
package demo.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArraryInitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArraryInitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArraryInitParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(ArraryInitParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArraryInitParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ArraryInitParser.ValueContext ctx);
}