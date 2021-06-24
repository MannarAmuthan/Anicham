package language;

import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;

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
            Vaarthai v = (Vaarthai) visitVaarthai(ctx.vaarthai());
            this.vaakiyam.add(v);
        }
        return null;
    }

    @Override
    public Object visitVaarthai(TamizhParser.VaarthaiContext ctx) {
        Vaarthai vaarthai = new Vaarthai();
        List<TamizhParser.ElutthuContext> elutthuList = ctx.elutthu();
        for (TamizhParser.ElutthuContext ec : elutthuList) {
            String s = (String) visitElutthu(ec);
            vaarthai.add(s);
        }
        return vaarthai;
    }

    @Override
    public Object visitElutthu(TamizhParser.ElutthuContext ctx) {
        return ctx.getText();
    }
}
