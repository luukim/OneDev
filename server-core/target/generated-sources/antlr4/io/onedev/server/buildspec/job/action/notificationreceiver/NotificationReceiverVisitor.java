// Generated from io/onedev/server/buildspec/job/action/notificationreceiver/NotificationReceiver.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.action.notificationreceiver;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotificationReceiverParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotificationReceiverVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotificationReceiverParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(NotificationReceiverParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotificationReceiverParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteria(NotificationReceiverParser.CriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotificationReceiverParser#userCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserCriteria(NotificationReceiverParser.UserCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotificationReceiverParser#groupCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupCriteria(NotificationReceiverParser.GroupCriteriaContext ctx);
}