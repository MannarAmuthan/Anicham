/**
 * @author Amuthan Mannan
 */

package anicham.language;

import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;
import anicham.language.models.Patthi;
import anicham.language.models.Vaakiyam;
import anicham.language.models.ezhuththu.Ezhuththu;
import anicham.language.models.sol.Sol;

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
        List<Ezhuththu> ezhuththuList = new LinkedList<>();
        List<TamizhParser.EzhuththuContext> elutthuList = ctx.ezhuththu();
        for (TamizhParser.EzhuththuContext ec : elutthuList) {
            Ezhuththu s = (Ezhuththu) visitEzhuththu(ec);
            ezhuththuList.add(s);
        }

        return new Sol(ezhuththuList);
    }

    @Override
    public Object visitEzhuththu(TamizhParser.EzhuththuContext ctx) {
        return Ezhuththu.create(ctx.getStop());
    }
}