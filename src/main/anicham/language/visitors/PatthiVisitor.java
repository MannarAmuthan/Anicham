package anicham.language.visitors;

import anicham.language.models.Patthi;
import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;

import java.util.LinkedList;
import java.util.List;

public class PatthiVisitor extends TamizhBaseVisitor<List<Patthi>> {

    @Override
    public List<Patthi> visitPatthi(TamizhParser.PatthiContext ctx) {
        VaakiyamVisitor vaakiyamVisitor=new VaakiyamVisitor();

        List<Patthi> patthigal= new LinkedList<>();
        List<TamizhParser.VaakiyamContext> vaakiyam = ctx.vaakiyam();

        if(vaakiyam.size()>0){
            Patthi patthi=new Patthi();
            for (TamizhParser.VaakiyamContext vc: vaakiyam){
                patthi.add(vaakiyamVisitor.visitVaakiyam(vc));
            }
            patthigal.add(patthi);
        }
        return patthigal;
    }
}
