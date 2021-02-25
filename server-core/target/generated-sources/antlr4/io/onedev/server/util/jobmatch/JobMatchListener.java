// Generated from io/onedev/server/util/jobmatch/JobMatch.g4 by ANTLR 4.7.2
package io.onedev.server.util.jobmatch;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JobMatchParser}.
 */
public interface JobMatchListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JobMatchParser#jobMatch}.
	 * @param ctx the parse tree
	 */
	void enterJobMatch(JobMatchParser.JobMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobMatchParser#jobMatch}.
	 * @param ctx the parse tree
	 */
	void exitJobMatch(JobMatchParser.JobMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterParensCriteria(JobMatchParser.ParensCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitParensCriteria(JobMatchParser.ParensCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOrCriteria(JobMatchParser.OrCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOrCriteria(JobMatchParser.OrCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterFieldOperatorValueCriteria(JobMatchParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitFieldOperatorValueCriteria(JobMatchParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterAndCriteria(JobMatchParser.AndCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitAndCriteria(JobMatchParser.AndCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValueCriteria(JobMatchParser.OperatorValueCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValueCriteria(JobMatchParser.OperatorValueCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterNotCriteria(JobMatchParser.NotCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitNotCriteria(JobMatchParser.NotCriteriaContext ctx);
}