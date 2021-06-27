/**
 * @author Amuthan Mannan
 */

package anicham.language.visitors;

import anicham.language.models.Patthi;
import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;

import java.util.LinkedList;
import java.util.List;

public class Visitor extends TamizhBaseVisitor<List<Patthi>> {


    @Override
    public List<Patthi> visitTamizh_script(TamizhParser.Tamizh_scriptContext ctx) {
        List<Patthi> patthi = new LinkedList<>();

        List<TamizhParser.PatthiContext> patthigal = ctx.patthi();
        PatthiVisitor patthiVisitor = new PatthiVisitor();
        if (patthigal.size() > 0) {
            for (TamizhParser.PatthiContext pc : patthigal) {
                patthi.addAll(patthiVisitor.visitPatthi(pc));
            }
        }
        return patthi;
    }

}