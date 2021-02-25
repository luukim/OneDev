// Generated from io/onedev/server/util/patternset/PatternSet.g4 by ANTLR 4.7.2
package io.onedev.server.util.patternset;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link PatternSetVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class PatternSetBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PatternSetVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPatterns(PatternSetParser.PatternsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPattern(PatternSetParser.PatternContext ctx) { return visitChildren(ctx); }
}