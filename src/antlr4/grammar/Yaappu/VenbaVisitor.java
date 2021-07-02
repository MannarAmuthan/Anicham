// Generated from grammar/Yaappu/Venba.g4 by ANTLR 4.5.1

    package grammar.Yaappu;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VenbaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VenbaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VenbaParser#venpa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVenpa(VenbaParser.VenpaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#adi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdi(VenbaParser.AdiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#eetradi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEetradi(VenbaParser.EetradiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#seer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeer(VenbaParser.SeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#moovasai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoovasai(VenbaParser.MoovasaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#eerasai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEerasai(VenbaParser.EerasaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#themangai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThemangai(VenbaParser.ThemangaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#themangani}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThemangani(VenbaParser.ThemanganiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#pulimangai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulimangai(VenbaParser.PulimangaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#pulimangani}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulimangani(VenbaParser.PulimanganiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#koovilangai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoovilangai(VenbaParser.KoovilangaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#koovilangani}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoovilangani(VenbaParser.KoovilanganiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#karuvilangai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKaruvilangai(VenbaParser.KaruvilangaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#karuvilangani}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKaruvilangani(VenbaParser.KaruvilanganiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#thema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThema(VenbaParser.ThemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#pulima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulima(VenbaParser.PulimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#koovilam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoovilam(VenbaParser.KoovilamContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#karuvilam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKaruvilam(VenbaParser.KaruvilamContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#eetru_seer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEetru_seer(VenbaParser.Eetru_seerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#nirai_asai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNirai_asai(VenbaParser.Nirai_asaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#ner_asai}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNer_asai(VenbaParser.Ner_asaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#kuril}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKuril(VenbaParser.KurilContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#nedil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNedil(VenbaParser.NedilContext ctx);
	/**
	 * Visit a parse tree produced by {@link VenbaParser#otru}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtru(VenbaParser.OtruContext ctx);
}