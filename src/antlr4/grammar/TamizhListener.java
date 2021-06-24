// Generated from grammar/Tamizh.g4 by ANTLR 4.5.1

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TamizhParser}.
 */
public interface TamizhListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TamizhParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TamizhParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TamizhParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void enterVaakiyam(TamizhParser.VaakiyamContext ctx);
	/**
	 * Exit a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void exitVaakiyam(TamizhParser.VaakiyamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamizhParser#vaarthai}.
	 * @param ctx the parse tree
	 */
	void enterVaarthai(TamizhParser.VaarthaiContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#vaarthai}.
	 * @param ctx the parse tree
	 */
	void exitVaarthai(TamizhParser.VaarthaiContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamizhParser#elutthu}.
	 * @param ctx the parse tree
	 */
	void enterElutthu(TamizhParser.ElutthuContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#elutthu}.
	 * @param ctx the parse tree
	 */
	void exitElutthu(TamizhParser.ElutthuContext ctx);
}