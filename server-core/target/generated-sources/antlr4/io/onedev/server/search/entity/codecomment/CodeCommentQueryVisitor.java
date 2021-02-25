// Generated from io/onedev/server/search/entity/codecomment/CodeCommentQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.codecomment;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodeCommentQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodeCommentQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodeCommentQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(CodeCommentQueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCriteria(CodeCommentQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensCriteria(CodeCommentQueryParser.ParensCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCriteria(CodeCommentQueryParser.OrCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorValueCriteria(CodeCommentQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCriteria(CodeCommentQueryParser.AndCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorValueCriteria(CodeCommentQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCriteria(CodeCommentQueryParser.NotCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeCommentQueryParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(CodeCommentQueryParser.OrderContext ctx);
}