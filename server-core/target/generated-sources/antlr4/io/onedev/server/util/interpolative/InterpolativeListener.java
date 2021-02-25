// Generated from io/onedev/server/util/interpolative/Interpolative.g4 by ANTLR 4.7.2
package io.onedev.server.util.interpolative;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterpolativeParser}.
 */
public interface InterpolativeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterpolativeParser#interpolative}.
	 * @param ctx the parse tree
	 */
	void enterInterpolative(InterpolativeParser.InterpolativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpolativeParser#interpolative}.
	 * @param ctx the parse tree
	 */
	void exitInterpolative(InterpolativeParser.InterpolativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpolativeParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(InterpolativeParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpolativeParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(InterpolativeParser.SegmentContext ctx);
}