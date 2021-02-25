// Generated from io/onedev/server/buildspec/job/log/instruction/LogInstruction.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.log.instruction;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogInstructionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogInstructionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogInstructionParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(LogInstructionParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogInstructionParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(LogInstructionParser.ParamContext ctx);
}