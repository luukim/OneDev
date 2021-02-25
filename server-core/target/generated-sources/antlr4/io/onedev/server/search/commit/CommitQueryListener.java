// Generated from io/onedev/server/search/commit/CommitQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.commit;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommitQueryParser}.
 */
public interface CommitQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommitQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(CommitQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommitQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(CommitQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommitQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterCriteria(CommitQueryParser.CriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommitQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitCriteria(CommitQueryParser.CriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommitQueryParser#revisionCriteria}.
	 * @param ctx the parse tree
	 */
	void enterRevisionCriteria(CommitQueryParser.RevisionCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommitQueryParser#revisionCriteria}.
	 * @param ctx the parse tree
	 */
	void exitRevisionCriteria(CommitQueryParser.RevisionCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommitQueryParser#beforeCriteria}.
	 * @param ctx the parse tree
	 */
	void enterBeforeCriteria(CommitQueryParser.BeforeCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommitQueryParser#beforeCriteria}.
	 * @param ctx the parse tree
	 */
	void exitBeforeCriteria(CommitQueryParser.BeforeCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommitQueryParser#afterCriteria}.
	 * @param ctx the parse tree
	 */
	void enterAfterCriteria(CommitQueryParser.AfterCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommitQueryParser#afterCriteria}.
	 * @param ctx the parse tree
	 */
	void exitAfterCriteria(CommitQueryParser.AfterCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommitQueryParser#committerCriteria}.
	 * @param ctx the parse tree
	 */
	void enterCommitterCriteria(CommitQueryParser.CommitterCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommitQueryParser#committerCriteria}.
	 * @param ctx the parse tree
	 */
	void exitCommitterCriteria(CommitQueryParser.CommitterCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommitQueryParser#authorCriteria}.
	 * @param ctx the parse tree
	 */
	void enterAuthorCriteria(CommitQueryParser.AuthorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommitQueryParser#authorCriteria}.
	 * @param ctx the parse tree
	 */
	void exitAuthorCriteria(CommitQueryParser.AuthorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommitQueryParser#pathCriteria}.
	 * @param ctx the parse tree
	 */
	void enterPathCriteria(CommitQueryParser.PathCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommitQueryParser#pathCriteria}.
	 * @param ctx the parse tree
	 */
	void exitPathCriteria(CommitQueryParser.PathCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommitQueryParser#messageCriteria}.
	 * @param ctx the parse tree
	 */
	void enterMessageCriteria(CommitQueryParser.MessageCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommitQueryParser#messageCriteria}.
	 * @param ctx the parse tree
	 */
	void exitMessageCriteria(CommitQueryParser.MessageCriteriaContext ctx);
}