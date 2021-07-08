package anicham.ilakkanam.visitors;

import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.models.Oasai;
import grammar.Yaappu.VenbaBaseVisitor;
import grammar.Yaappu.VenbaParser;

import java.util.LinkedList;
import java.util.List;

public class AsaiVisitor extends VenbaBaseVisitor<Asai> {
    OasaiVisitor oasaiVisitor;
    public AsaiVisitor() {
        oasaiVisitor =new OasaiVisitor();
    }

    @Override
    public Asai visitNirai_asai(VenbaParser.Nirai_asaiContext ctx) {
        List<Oasai> oasais =new LinkedList<>();

        List<VenbaParser.KurilContext> kurilkal = ctx.kuril();
        for(VenbaParser.KurilContext kurilC: kurilkal){
            oasais.add(oasaiVisitor.visitKuril(kurilC));
        }

        if(ctx.nedil()!=null){
            oasais.add(oasaiVisitor.visitNedil(ctx.nedil()));
        }
        List<VenbaParser.OtruContext> otrukal = ctx.otru();
        for(VenbaParser.OtruContext oruC: otrukal){
            oasais.add(oasaiVisitor.visitOtru(oruC));
        }
        if(oasais.size()==0) return null;
        return Asai.getNiraiAsai(oasais.toArray(new Oasai[0]));
    }

    @Override
    public Asai visitNer_asai(VenbaParser.Ner_asaiContext ctx) {
        List<Oasai> oasais =new LinkedList<>();

        if(ctx.kuril()!=null){
            oasais.add(oasaiVisitor.visitKuril(ctx.kuril()));
        }
        if(ctx.nedil()!=null){
            oasais.add(oasaiVisitor.visitNedil(ctx.nedil()));
        }
        List<VenbaParser.OtruContext> otrukal = ctx.otru();
        for(VenbaParser.OtruContext oruC: otrukal){
            oasais.add(oasaiVisitor.visitOtru(oruC));
        }

        if(oasais.size()==0) return null;
        return Asai.getNerAsai(oasais.toArray(new Oasai[0]));
    }
}
