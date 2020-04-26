// Generated from /home/lu/IdeaProjects/compiler/src/main/java/lab1demo2/Lab1_2.g4 by ANTLR 4.8
package lab1demo2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Lab1_2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Lab1_2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Lab1_2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Lab1_2Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lab1_2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(Lab1_2Parser.StatContext ctx);
}