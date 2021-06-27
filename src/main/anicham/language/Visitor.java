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
    public Object visitTamizh_script(TamizhParser.Tamizh_scriptContext ctx) {
        List<TamizhParser.PatthiContext> patthigal = ctx.patthi();
        if(patthigal.size()>0){
            for(TamizhParser.PatthiContext pc:patthigal){
                visitPatthi(pc);
            }
        }
        return null;
    }

    @Override
    public Object visitPatthi(TamizhParser.PatthiContext ctx) {

        List<TamizhParser.VaakiyamContext> vaakiyam = ctx.vaakiyam();
        if(vaakiyam.size()>0){
            Patthi patthi=new Patthi();
            for (TamizhParser.VaakiyamContext vc: vaakiyam){
                patthi.add((Vaakiyam)visitVaakiyam(vc));
            }
            this.patthigal.add(patthi);
        }
        return null;
    }

    @Override
    public Object visitVaakiyam(TamizhParser.VaakiyamContext ctx) {

        List<TamizhParser.SolContext> sol = ctx.sol();
        if(sol.size()>0){
            Vaakiyam v1 = new Vaakiyam();
            for(TamizhParser.SolContext sc:sol) {
                Sol v = (Sol) visitSol(sc);
                v1.add(v);
            }
            return v1;
        }
        return null;
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