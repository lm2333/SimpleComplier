// Generated from /home/lu/IdeaProjects/compiler/src/main/java/lab1demo2/Lab1_2.g4 by ANTLR 4.8
package lab1demo2;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link Lab1_2Visitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class Lab1_2BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements Lab1_2Visitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProg(Lab1_2Parser.ProgContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStat(Lab1_2Parser.StatContext ctx) { return visitChildren(ctx); }
}