// Generated from io/onedev/server/buildspec/job/action/notificationreceiver/NotificationReceiver.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.action.notificationreceiver;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotificationReceiverParser}.
 */
public interface NotificationReceiverListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotificationReceiverParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(NotificationReceiverParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotificationReceiverParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(NotificationReceiverParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotificationReceiverParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterCriteria(NotificationReceiverParser.CriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotificationReceiverParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitCriteria(NotificationReceiverParser.CriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotificationReceiverParser#userCriteria}.
	 * @param ctx the parse tree
	 */
	void enterUserCriteria(NotificationReceiverParser.UserCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotificationReceiverParser#userCriteria}.
	 * @param ctx the parse tree
	 */
	void exitUserCriteria(NotificationReceiverParser.UserCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotificationReceiverParser#groupCriteria}.
	 * @param ctx the parse tree
	 */
	void enterGroupCriteria(NotificationReceiverParser.GroupCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotificationReceiverParser#groupCriteria}.
	 * @param ctx the parse tree
	 */
	void exitGroupCriteria(NotificationReceiverParser.GroupCriteriaContext ctx);
}