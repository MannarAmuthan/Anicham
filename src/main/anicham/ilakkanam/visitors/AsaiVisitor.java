package anicham.ilakkanam.visitors;

import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.models.Ozhi;
import grammar.Yaappu.VenbaBaseVisitor;
import grammar.Yaappu.VenbaParser;

import java.util.LinkedList;
import java.util.List;

public class AsaiVisitor extends VenbaBaseVisitor<Asai> {
    OzhiVisitor ozhiVisitor;
    public AsaiVisitor() {
        ozhiVisitor=new OzhiVisitor();
    }

    @Override
    public Asai visitNirai_asai(VenbaParser.Nirai_asaiContext ctx) {
        List<Ozhi> ozhis=new LinkedList<>();

        List<VenbaParser.KurilContext> kurilkal = ctx.kuril();
        for(VenbaParser.KurilContext kurilC: kurilkal){
            ozhis.add(ozhiVisitor.visitKuril(kurilC));
        }

        if(ctx.nedil()!=null){
            ozhis.add(ozhiVisitor.visitNedil(ctx.nedil()));
        }
        List<VenbaParser.OtruContext> otrukal = ctx.otru();
        for(VenbaParser.OtruContext oruC: otrukal){
            ozhis.add(ozhiVisitor.visitOtru(oruC));
        }
        return Asai.getNiraiAsai(ozhis.toArray(new Ozhi[0]));
    }

    @Override
    public Asai visitNer_asai(VenbaParser.Ner_asaiContext ctx) {
        List<Ozhi> ozhis=new LinkedList<>();

        if(ctx.kuril()!=null){
            ozhis.add(ozhiVisitor.visitKuril(ctx.kuril()));
        }
        if(ctx.nedil()!=null){
            ozhis.add(ozhiVisitor.visitNedil(ctx.nedil()));
        }
        List<VenbaParser.OtruContext> otrukal = ctx.otru();
        for(VenbaParser.OtruContext oruC: otrukal){
            ozhis.add(ozhiVisitor.visitOtru(oruC));
        }
        return Asai.getNerAsai(ozhis.toArray(new Ozhi[0]));
    }
}
