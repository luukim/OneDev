// Generated from io/onedev/server/search/entity/project/ProjectQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.project;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectQueryParser}.
 */
public interface ProjectQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ProjectQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ProjectQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCriteria(ProjectQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCriteria(ProjectQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterParensCriteria(ProjectQueryParser.ParensCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitParensCriteria(ProjectQueryParser.ParensCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOrCriteria(ProjectQueryParser.OrCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOrCriteria(ProjectQueryParser.OrCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorValueCriteria(ProjectQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorValueCriteria(ProjectQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterAndCriteria(ProjectQueryParser.AndCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitAndCriteria(ProjectQueryParser.AndCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValueCriteria(ProjectQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValueCriteria(ProjectQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterNotCriteria(ProjectQueryParser.NotCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link ProjectQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitNotCriteria(ProjectQueryParser.NotCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(ProjectQueryParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(ProjectQueryParser.OrderContext ctx);
}