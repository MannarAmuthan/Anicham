package anicham.language.visitors;

import anicham.language.models.Vaakiyam;
import anicham.language.models.sol.Sol;
import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;

import java.util.List;

public class VaakiyamVisitor extends TamizhBaseVisitor<Vaakiyam> {

    @Override
    public Vaakiyam visitVaakiyam(TamizhParser.VaakiyamContext ctx) {
        SolVisitor solVisitor=new SolVisitor();

        List<TamizhParser.SolContext> sol = ctx.sol();
        Vaakiyam v1 = new Vaakiyam();
        if (sol.size() > 0) {

            for (TamizhParser.SolContext sc : sol) {
                Sol v = solVisitor.visitSol(sc);
                v1.add(v);
            }

        }
        return v1;
    }

}
