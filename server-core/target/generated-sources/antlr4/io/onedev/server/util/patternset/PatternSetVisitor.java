// Generated from io/onedev/server/util/patternset/PatternSet.g4 by ANTLR 4.7.2
package io.onedev.server.util.patternset;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PatternSetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PatternSetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PatternSetParser#patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatterns(PatternSetParser.PatternsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatternSetParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(PatternSetParser.PatternContext ctx);
}