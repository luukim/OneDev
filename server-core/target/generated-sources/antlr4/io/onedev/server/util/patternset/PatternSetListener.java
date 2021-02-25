// Generated from io/onedev/server/util/patternset/PatternSet.g4 by ANTLR 4.7.2
package io.onedev.server.util.patternset;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PatternSetParser}.
 */
public interface PatternSetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PatternSetParser#patterns}.
	 * @param ctx the parse tree
	 */
	void enterPatterns(PatternSetParser.PatternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatternSetParser#patterns}.
	 * @param ctx the parse tree
	 */
	void exitPatterns(PatternSetParser.PatternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatternSetParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(PatternSetParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatternSetParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(PatternSetParser.PatternContext ctx);
}