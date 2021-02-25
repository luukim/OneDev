// Generated from io/onedev/server/search/entity/issue/IssueQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.issue;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IssueQueryParser}.
 */
public interface IssueQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IssueQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(IssueQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IssueQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(IssueQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCriteria(IssueQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCriteria(IssueQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterParensCriteria(IssueQueryParser.ParensCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitParensCriteria(IssueQueryParser.ParensCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOrCriteria(IssueQueryParser.OrCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOrCriteria(IssueQueryParser.OrCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorValueCriteria(IssueQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorValueCriteria(IssueQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorCriteria(IssueQueryParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorCriteria(IssueQueryParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterAndCriteria(IssueQueryParser.AndCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitAndCriteria(IssueQueryParser.AndCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FixedBetweenCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFixedBetweenCriteria(IssueQueryParser.FixedBetweenCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FixedBetweenCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFixedBetweenCriteria(IssueQueryParser.FixedBetweenCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValueCriteria(IssueQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValueCriteria(IssueQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterNotCriteria(IssueQueryParser.NotCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitNotCriteria(IssueQueryParser.NotCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IssueQueryParser#revisionCriteria}.
	 * @param ctx the parse tree
	 */
	void enterRevisionCriteria(IssueQueryParser.RevisionCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IssueQueryParser#revisionCriteria}.
	 * @param ctx the parse tree
	 */
	void exitRevisionCriteria(IssueQueryParser.RevisionCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IssueQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(IssueQueryParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link IssueQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(IssueQueryParser.OrderContext ctx);
}