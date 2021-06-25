/**
 * @author Amuthan Mannan
 */

package language;

import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;
import language.models.Vaakiyam;
import language.models.sol.Sol;

import java.util.LinkedList;
import java.util.List;

public class Visitor extends TamizhBaseVisitor {
    public Vaakiyam vaakiyam;

    public Visitor() {
        vaakiyam = new Vaakiyam();
    }

    @Override
    public Object visitStart(TamizhParser.StartContext ctx) {
        if (ctx.vaakiyam() != null) {
            visitVaakiyam(ctx.vaakiyam());
        }
        return null;
    }

    @Override
    public Object visitVaakiyam(TamizhParser.VaakiyamContext ctx) {
        List<TamizhParser.VaakiyamContext> vaakiyam = ctx.vaakiyam();
        if (vaakiyam.size() > 0) {
            for (TamizhParser.VaakiyamContext vc: vaakiyam){
                visitVaakiyam(vc);
            }
        }
        else {
            Sol v = (Sol) visitSol(ctx.sol());
            this.vaakiyam.add(v);
        }
        return null;
    }

    @Override
    public Object visitSol(TamizhParser.SolContext ctx) {
        List<String> stringList = new LinkedList<>();
        List<TamizhParser.EzhuththuContext> elutthuList = ctx.ezhuththu();
        for (TamizhParser.EzhuththuContext ec : elutthuList) {
            String s = (String) visitEzhuththu(ec);
            stringList.add(s);
        }

        return new Sol(stringList);
    }

    @Override
    public Object visitEzhuththu(TamizhParser.EzhuththuContext ctx) {
        return ctx.getText();
    }
}