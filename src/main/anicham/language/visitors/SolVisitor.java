package anicham.language.visitors;

import anicham.language.models.ezhuththu.Ezhuththu;
import anicham.language.models.sol.Sol;
import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;

import java.util.LinkedList;
import java.util.List;

public class SolVisitor extends TamizhBaseVisitor<Sol> {
    @Override
    public Sol visitSol(TamizhParser.SolContext ctx) {
        EzhuththuVisitor ezhuththuVisitor =new EzhuththuVisitor();

        List<Ezhuththu> ezhuththuList = new LinkedList<>();
        List<TamizhParser.EzhuththuContext> elutthuList = ctx.ezhuththu();
        for (TamizhParser.EzhuththuContext ec : elutthuList) {
            Ezhuththu s = ezhuththuVisitor.visitEzhuththu(ec);
            ezhuththuList.add(s);
        }

        return new Sol(ezhuththuList);
    }
}
