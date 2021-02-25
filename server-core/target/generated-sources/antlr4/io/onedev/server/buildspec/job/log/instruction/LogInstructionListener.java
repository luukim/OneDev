// Generated from io/onedev/server/buildspec/job/log/instruction/LogInstruction.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.log.instruction;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogInstructionParser}.
 */
public interface LogInstructionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogInstructionParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(LogInstructionParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogInstructionParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(LogInstructionParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogInstructionParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(LogInstructionParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogInstructionParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(LogInstructionParser.ParamContext ctx);
}