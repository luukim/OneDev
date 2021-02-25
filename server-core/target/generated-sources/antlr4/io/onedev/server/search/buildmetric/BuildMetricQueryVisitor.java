// Generated from io/onedev/server/search/buildmetric/BuildMetricQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.buildmetric;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BuildMetricQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BuildMetricQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BuildMetricQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(BuildMetricQueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCriteria(BuildMetricQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensCriteria(BuildMetricQueryParser.ParensCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCriteria(BuildMetricQueryParser.OrCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorValueCriteria(BuildMetricQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorCriteria(BuildMetricQueryParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCriteria(BuildMetricQueryParser.AndCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorValueCriteria(BuildMetricQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCriteria(BuildMetricQueryParser.NotCriteriaContext ctx);
}