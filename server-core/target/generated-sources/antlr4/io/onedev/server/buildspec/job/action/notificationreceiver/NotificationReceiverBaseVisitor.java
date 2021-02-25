// Generated from io/onedev/server/buildspec/job/action/notificationreceiver/NotificationReceiver.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.action.notificationreceiver;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link NotificationReceiverVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class NotificationReceiverBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements NotificationReceiverVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReceiver(NotificationReceiverParser.ReceiverContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCriteria(NotificationReceiverParser.CriteriaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUserCriteria(NotificationReceiverParser.UserCriteriaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGroupCriteria(NotificationReceiverParser.GroupCriteriaContext ctx) { return visitChildren(ctx); }
}