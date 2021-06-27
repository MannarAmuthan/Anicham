package anicham.language.visitors;

import anicham.language.models.ezhuththu.Ezhuththu;
import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;

public class EzhuththuVisitor extends TamizhBaseVisitor<Ezhuththu> {


    @Override
    public Ezhuththu visitEzhuththu(TamizhParser.EzhuththuContext ctx) {
        return Ezhuththu.create(ctx.getStop());
    }
}
