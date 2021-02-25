// Generated from io/onedev/server/buildspec/job/action/condition/ActionCondition.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.action.condition;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ActionConditionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ActionConditionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ActionConditionParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ActionConditionParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCriteria(ActionConditionParser.OperatorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensCriteria(ActionConditionParser.ParensCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCriteria(ActionConditionParser.OrCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorValueCriteria(ActionConditionParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorCriteria(ActionConditionParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCriteria(ActionConditionParser.AndCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorValueCriteria(ActionConditionParser.OperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link ActionConditionParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCriteria(ActionConditionParser.NotCriteriaContext ctx);
}