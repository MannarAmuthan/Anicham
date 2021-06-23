// Generated from grammar/Tamizh.g4 by ANTLR 4.5.1

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TamizhParser}.
 */
public interface TamizhListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TamizhParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(TamizhParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(TamizhParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamizhParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(TamizhParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(TamizhParser.WordContext ctx);
}