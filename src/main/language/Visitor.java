/**
 * @author Amuthan Mannan
 */

package language;

import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;
import language.models.Patthi;
import language.models.Vaakiyam;
import language.models.sol.Sol;
import java.util.LinkedList;
import java.util.List;

public class Visitor extends TamizhBaseVisitor {
    List<Patthi> patthigal;

    public Visitor() {
        patthigal = new LinkedList<>();
    }

    public List<Patthi> getPatthigal() {
        return patthigal;
    }

    @Override
    public Object visitPatthi(TamizhParser.PatthiContext ctx) {
        List<TamizhParser.PatthiContext> patthigal = ctx.patthi();
        if(patthigal.size()>0){
            for(TamizhParser.PatthiContext pc:patthigal){
                visitPatthi(pc);
            }
        }
        List<TamizhParser.VaakiyamContext> vaakiyangal = ctx.vaakiyam();
        if(vaakiyangal.size()>0){
            Patthi patthi=new Patthi();
            for(TamizhParser.VaakiyamContext vc:vaakiyangal){
                patthi.add((Vaakiyam) visitVaakiyam(vc));
            }
            this.patthigal.add(patthi);
        }
        return null;
    }

    @Override
    public Object visitVaakiyam(TamizhParser.VaakiyamContext ctx) {
        List<TamizhParser.VaakiyamContext> vaakiyam = ctx.vaakiyam();
        if (vaakiyam.size() > 0) {
            Vaakiyam v1=new Vaakiyam();
            for (TamizhParser.VaakiyamContext vc: vaakiyam){
                v1.add((Vaakiyam) visitVaakiyam(vc));
            }
            return v1;
        }
        else {
            Sol v = (Sol) visitSol(ctx.sol());
            Vaakiyam v1=new Vaakiyam();
            v1.add(v);
            return v1;
        }
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