// Generated from io/onedev/server/search/entity/codecomment/CodeCommentQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.codecomment;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodeCommentQueryParser}.
 */
public interface CodeCommentQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodeCommentQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(CodeCommentQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCommentQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(CodeCommentQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCriteria(CodeCommentQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCriteria(CodeCommentQueryParser.OperatorCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterParensCriteria(CodeCommentQueryParser.ParensCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitParensCriteria(CodeCommentQueryParser.ParensCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOrCriteria(CodeCommentQueryParser.OrCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOrCriteria(CodeCommentQueryParser.OrCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorValueCriteria(CodeCommentQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorValueCriteria(CodeCommentQueryParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterAndCriteria(CodeCommentQueryParser.AndCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitAndCriteria(CodeCommentQueryParser.AndCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValueCriteria(CodeCommentQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValueCriteria(CodeCommentQueryParser.OperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterNotCriteria(CodeCommentQueryParser.NotCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link CodeCommentQueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitNotCriteria(CodeCommentQueryParser.NotCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeCommentQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(CodeCommentQueryParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCommentQueryParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(CodeCommentQueryParser.OrderContext ctx);
}