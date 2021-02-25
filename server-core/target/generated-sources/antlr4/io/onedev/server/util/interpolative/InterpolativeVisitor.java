// Generated from io/onedev/server/util/interpolative/Interpolative.g4 by ANTLR 4.7.2
package io.onedev.server.util.interpolative;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterpolativeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterpolativeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterpolativeParser#interpolative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolative(InterpolativeParser.InterpolativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpolativeParser#segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment(InterpolativeParser.SegmentContext ctx);
}