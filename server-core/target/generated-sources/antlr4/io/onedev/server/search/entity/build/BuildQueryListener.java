// Generated from io/onedev/server/search/entity/build/BuildQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.build;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BuildQueryParser}.
 */
public interface BuildQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BuildQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(BuildQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuildQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(BuildQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCriteria(BuildQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCriteria(BuildQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterParensCriteria(BuildQueryParser.ParensCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitParensCriteria(BuildQueryParser.ParensCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOrCriteria(BuildQueryParser.OrCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOrCriteria(BuildQueryParser.OrCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorValueCriteria(BuildQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorValueCriteria(BuildQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorCriteria(BuildQueryParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorCriteria(BuildQueryParser.FieldOperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterAndCriteria(BuildQueryParser.AndCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitAndCriteria(BuildQueryParser.AndCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValueCriteria(BuildQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValueCriteria(BuildQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterNotCriteria(BuildQueryParser.NotCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link BuildQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitNotCriteria(BuildQueryParser.NotCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuildQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(BuildQueryParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuildQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(BuildQueryParser.OrderContext ctx);
}