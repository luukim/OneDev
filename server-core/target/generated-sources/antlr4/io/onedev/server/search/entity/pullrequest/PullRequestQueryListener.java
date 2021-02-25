// Generated from io/onedev/server/search/entity/pullrequest/PullRequestQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.pullrequest;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PullRequestQueryParser}.
 */
public interface PullRequestQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PullRequestQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(PullRequestQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PullRequestQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(PullRequestQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCriteria(PullRequestQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCriteria(PullRequestQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterParensCriteria(PullRequestQueryParser.ParensCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitParensCriteria(PullRequestQueryParser.ParensCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOrCriteria(PullRequestQueryParser.OrCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOrCriteria(PullRequestQueryParser.OrCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorValueCriteria(PullRequestQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorValueCriteria(PullRequestQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterAndCriteria(PullRequestQueryParser.AndCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitAndCriteria(PullRequestQueryParser.AndCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValueCriteria(PullRequestQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValueCriteria(PullRequestQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterNotCriteria(PullRequestQueryParser.NotCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link PullRequestQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitNotCriteria(PullRequestQueryParser.NotCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PullRequestQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(PullRequestQueryParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PullRequestQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(PullRequestQueryParser.OrderContext ctx);
}