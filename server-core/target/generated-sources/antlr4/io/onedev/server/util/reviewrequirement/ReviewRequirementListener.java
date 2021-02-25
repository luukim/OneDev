// Generated from io/onedev/server/util/reviewrequirement/ReviewRequirement.g4 by ANTLR 4.7.2
package io.onedev.server.util.reviewrequirement;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReviewRequirementParser}.
 */
public interface ReviewRequirementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReviewRequirementParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(ReviewRequirementParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReviewRequirementParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(ReviewRequirementParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReviewRequirementParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterCriteria(ReviewRequirementParser.CriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReviewRequirementParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitCriteria(ReviewRequirementParser.CriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReviewRequirementParser#userCriteria}.
	 * @param ctx the parse tree
	 */
	void enterUserCriteria(ReviewRequirementParser.UserCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReviewRequirementParser#userCriteria}.
	 * @param ctx the parse tree
	 */
	void exitUserCriteria(ReviewRequirementParser.UserCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReviewRequirementParser#groupCriteria}.
	 * @param ctx the parse tree
	 */
	void enterGroupCriteria(ReviewRequirementParser.GroupCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReviewRequirementParser#groupCriteria}.
	 * @param ctx the parse tree
	 */
	void exitGroupCriteria(ReviewRequirementParser.GroupCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReviewRequirementParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(ReviewRequirementParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReviewRequirementParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(ReviewRequirementParser.CountContext ctx);
}