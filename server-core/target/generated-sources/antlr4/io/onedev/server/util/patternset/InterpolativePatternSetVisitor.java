// Generated from io/onedev/server/util/patternset/InterpolativePatternSet.g4 by ANTLR 4.7.2
package io.onedev.server.util.patternset;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterpolativePatternSetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterpolativePatternSetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterpolativePatternSetParser#interpolative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolative(InterpolativePatternSetParser.InterpolativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpolativePatternSetParser#segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment(InterpolativePatternSetParser.SegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpolativePatternSetParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(InterpolativePatternSetParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpolativePatternSetParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(InterpolativePatternSetParser.PatternContext ctx);
}