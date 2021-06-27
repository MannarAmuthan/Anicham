// Generated from grammar/Tamizh.g4 by ANTLR 4.5.1

    package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TamizhParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TamizhVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TamizhParser#tamizh_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTamizh_script(TamizhParser.Tamizh_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamizhParser#patthi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatthi(TamizhParser.PatthiContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamizhParser#vaakiyam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaakiyam(TamizhParser.VaakiyamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamizhParser#sol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSol(TamizhParser.SolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamizhParser#ezhuththu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEzhuththu(TamizhParser.EzhuththuContext ctx);
}