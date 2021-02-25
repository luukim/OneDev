// Generated from io/onedev/server/util/usermatch/UserMatch.g4 by ANTLR 4.7.2
package io.onedev.server.util.usermatch;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UserMatchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UserMatchVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UserMatchParser#userMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserMatch(UserMatchParser.UserMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserMatchParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteria(UserMatchParser.CriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserMatchParser#exceptCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptCriteria(UserMatchParser.ExceptCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserMatchParser#userCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserCriteria(UserMatchParser.UserCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserMatchParser#groupCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupCriteria(UserMatchParser.GroupCriteriaContext ctx);
}