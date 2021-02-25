// Generated from io/onedev/server/search/entity/issue/IssueQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.issue;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IssueQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IssueQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IssueQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(IssueQueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCriteria(IssueQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensCriteria(IssueQueryParser.ParensCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCriteria(IssueQueryParser.OrCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorValueCriteria(IssueQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorCriteria(IssueQueryParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCriteria(IssueQueryParser.AndCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FixedBetweenCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedBetweenCriteria(IssueQueryParser.FixedBetweenCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorValueCriteria(IssueQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link IssueQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCriteria(IssueQueryParser.NotCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IssueQueryParser#revisionCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevisionCriteria(IssueQueryParser.RevisionCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IssueQueryParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(IssueQueryParser.OrderContext ctx);
}