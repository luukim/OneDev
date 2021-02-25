// Generated from io/onedev/server/util/usermatch/UserMatch.g4 by ANTLR 4.7.2
package io.onedev.server.util.usermatch;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UserMatchParser}.
 */
public interface UserMatchListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UserMatchParser#userMatch}.
	 * @param ctx the parse tree
	 */
	void enterUserMatch(UserMatchParser.UserMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserMatchParser#userMatch}.
	 * @param ctx the parse tree
	 */
	void exitUserMatch(UserMatchParser.UserMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterCriteria(UserMatchParser.CriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitCriteria(UserMatchParser.CriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserMatchParser#exceptCriteria}.
	 * @param ctx the parse tree
	 */
	void enterExceptCriteria(UserMatchParser.ExceptCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserMatchParser#exceptCriteria}.
	 * @param ctx the parse tree
	 */
	void exitExceptCriteria(UserMatchParser.ExceptCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserMatchParser#userCriteria}.
	 * @param ctx the parse tree
	 */
	void enterUserCriteria(UserMatchParser.UserCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserMatchParser#userCriteria}.
	 * @param ctx the parse tree
	 */
	void exitUserCriteria(UserMatchParser.UserCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserMatchParser#groupCriteria}.
	 * @param ctx the parse tree
	 */
	void enterGroupCriteria(UserMatchParser.GroupCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserMatchParser#groupCriteria}.
	 * @param ctx the parse tree
	 */
	void exitGroupCriteria(UserMatchParser.GroupCriteriaContext ctx);
}