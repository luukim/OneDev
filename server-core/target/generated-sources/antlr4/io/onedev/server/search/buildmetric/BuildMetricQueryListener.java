// Generated from io/onedev/server/search/buildmetric/BuildMetricQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.buildmetric;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BuildMetricQueryParser}.
 */
public interface BuildMetricQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BuildMetricQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(BuildMetricQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuildMetricQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(BuildMetricQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCriteria(BuildMetricQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCriteria(BuildMetricQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterParensCriteria(BuildMetricQueryParser.ParensCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitParensCriteria(BuildMetricQueryParser.ParensCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOrCriteria(BuildMetricQueryParser.OrCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOrCriteria(BuildMetricQueryParser.OrCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorValueCriteria(BuildMetricQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorValueCriteria(BuildMetricQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorCriteria(BuildMetricQueryParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorCriteria(BuildMetricQueryParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterAndCriteria(BuildMetricQueryParser.AndCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitAndCriteria(BuildMetricQueryParser.AndCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValueCriteria(BuildMetricQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValueCriteria(BuildMetricQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterNotCriteria(BuildMetricQueryParser.NotCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link BuildMetricQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitNotCriteria(BuildMetricQueryParser.NotCriteriaContext ctx);
}