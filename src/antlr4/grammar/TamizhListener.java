// Generated from grammar/Tamizh.g4 by ANTLR 4.5.1

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TamizhParser}.
 */
public interface TamizhListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TamizhParser#tamizh_script}.
	 * @param ctx the parse tree
	 */
	void enterTamizh_script(TamizhParser.Tamizh_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#tamizh_script}.
	 * @param ctx the parse tree
	 */
	void exitTamizh_script(TamizhParser.Tamizh_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamizhParser#patthi}.
	 * @param ctx the parse tree
	 */
	void enterPatthi(TamizhParser.PatthiContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#patthi}.
	 * @param ctx the parse tree
	 */
	void exitPatthi(TamizhParser.PatthiContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamizhParser#vaakiyam}.
	 * @param ctx the parse tree
	 */
	void enterVaakiyam(TamizhParser.VaakiyamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#vaakiyam}.
	 * @param ctx the parse tree
	 */
	void exitVaakiyam(TamizhParser.VaakiyamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamizhParser#sol}.
	 * @param ctx the parse tree
	 */
	void enterSol(TamizhParser.SolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#sol}.
	 * @param ctx the parse tree
	 */
	void exitSol(TamizhParser.SolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamizhParser#ezhuththu}.
	 * @param ctx the parse tree
	 */
	void enterEzhuththu(TamizhParser.EzhuththuContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamizhParser#ezhuththu}.
	 * @param ctx the parse tree
	 */
	void exitEzhuththu(TamizhParser.EzhuththuContext ctx);
}