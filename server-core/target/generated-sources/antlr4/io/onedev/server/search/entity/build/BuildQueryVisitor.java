// Generated from io/onedev/server/search/entity/build/BuildQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.build;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BuildQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BuildQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BuildQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(BuildQueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCriteria(BuildQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensCriteria(BuildQueryParser.ParensCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCriteria(BuildQueryParser.OrCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorValueCriteria(BuildQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorCriteria(BuildQueryParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCriteria(BuildQueryParser.AndCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorValueCriteria(BuildQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCriteria(BuildQueryParser.NotCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BuildQueryParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(BuildQueryParser.OrderContext ctx);
}