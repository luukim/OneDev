// Generated from io/onedev/server/util/jobmatch/JobMatch.g4 by ANTLR 4.7.2
package io.onedev.server.util.jobmatch;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JobMatchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JobMatchVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JobMatchParser#jobMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobMatch(JobMatchParser.JobMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensCriteria(JobMatchParser.ParensCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCriteria(JobMatchParser.OrCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldOperatorValueCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOperatorValueCriteria(JobMatchParser.FieldOperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCriteria(JobMatchParser.AndCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorValueCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorValueCriteria(JobMatchParser.OperatorValueCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCriteria}
	 * labeled alternative in {@link JobMatchParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCriteria(JobMatchParser.NotCriteriaContext ctx);
}