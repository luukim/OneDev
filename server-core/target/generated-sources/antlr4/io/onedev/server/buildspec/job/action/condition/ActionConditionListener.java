// Generated from io/onedev/server/buildspec/job/action/condition/ActionCondition.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.action.condition;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ActionConditionParser}.
 */
public interface ActionConditionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ActionConditionParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ActionConditionParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionConditionParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ActionConditionParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCriteria(ActionConditionParser.OperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCriteria(ActionConditionParser.OperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterParensCriteria(ActionConditionParser.ParensCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitParensCriteria(ActionConditionParser.ParensCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOrCriteria(ActionConditionParser.OrCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOrCriteria(ActionConditionParser.OrCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorValueCriteria(ActionConditionParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorValueCriteria(ActionConditionParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorCriteria(ActionConditionParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorCriteria(ActionConditionParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterAndCriteria(ActionConditionParser.AndCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitAndCriteria(ActionConditionParser.AndCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValueCriteria(ActionConditionParser.OperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValueCriteria(ActionConditionParser.OperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterNotCriteria(ActionConditionParser.NotCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitNotCriteria(ActionConditionParser.NotCriteriaContext ctx);
}