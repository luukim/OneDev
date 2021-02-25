// Generated from io/onedev/server/search/commit/CommitQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.commit;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommitQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommitQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommitQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(CommitQueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommitQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteria(CommitQueryParser.CriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommitQueryParser#revisionCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevisionCriteria(CommitQueryParser.RevisionCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommitQueryParser#beforeCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeforeCriteria(CommitQueryParser.BeforeCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommitQueryParser#afterCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterCriteria(CommitQueryParser.AfterCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommitQueryParser#committerCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitterCriteria(CommitQueryParser.CommitterCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommitQueryParser#authorCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorCriteria(CommitQueryParser.AuthorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommitQueryParser#pathCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathCriteria(CommitQueryParser.PathCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommitQueryParser#messageCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageCriteria(CommitQueryParser.MessageCriteriaContext ctx);
}