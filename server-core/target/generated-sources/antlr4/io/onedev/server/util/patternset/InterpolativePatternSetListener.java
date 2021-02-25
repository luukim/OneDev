// Generated from io/onedev/server/util/patternset/InterpolativePatternSet.g4 by ANTLR 4.7.2
package io.onedev.server.util.patternset;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterpolativePatternSetParser}.
 */
public interface InterpolativePatternSetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterpolativePatternSetParser#interpolative}.
	 * @param ctx the parse tree
	 */
	void enterInterpolative(InterpolativePatternSetParser.InterpolativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpolativePatternSetParser#interpolative}.
	 * @param ctx the parse tree
	 */
	void exitInterpolative(InterpolativePatternSetParser.InterpolativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpolativePatternSetParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(InterpolativePatternSetParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpolativePatternSetParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(InterpolativePatternSetParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpolativePatternSetParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(InterpolativePatternSetParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpolativePatternSetParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(InterpolativePatternSetParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpolativePatternSetParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(InterpolativePatternSetParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpolativePatternSetParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(InterpolativePatternSetParser.PatternContext ctx);
}