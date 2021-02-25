// Generated from io/onedev/server/buildspec/job/retrycondition/RetryCondition.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.retrycondition;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RetryConditionParser}.
 */
public interface RetryConditionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RetryConditionParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(RetryConditionParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetryConditionParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(RetryConditionParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterParensCriteria(RetryConditionParser.ParensCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitParensCriteria(RetryConditionParser.ParensCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOrCriteria(RetryConditionParser.OrCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOrCriteria(RetryConditionParser.OrCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorValueCriteria(RetryConditionParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorValueCriteria(RetryConditionParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorCriteria(RetryConditionParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorCriteria(RetryConditionParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterAndCriteria(RetryConditionParser.AndCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitAndCriteria(RetryConditionParser.AndCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterNotCriteria(RetryConditionParser.NotCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link RetryConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitNotCriteria(RetryConditionParser.NotCriteriaContext ctx);
}