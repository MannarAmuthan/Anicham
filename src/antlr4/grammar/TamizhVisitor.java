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
	 * Visit a parse tree produced by {@link TamizhParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(TamizhParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamizhParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaakiyam(TamizhParser.VaakiyamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamizhParser#vaarthai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaarthai(TamizhParser.VaarthaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamizhParser#elutthu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElutthu(TamizhParser.ElutthuContext ctx);
}