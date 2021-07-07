package anicham.ilakkanam.visitors;

import anicham.ilakkanam.models.Adi;
import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.models.Ozhi;
import anicham.ilakkanam.models.seer.EerasaiSeer;
import anicham.ilakkanam.models.seer.EetruSeer;
import anicham.ilakkanam.models.seer.MoovasaiSeer;
import anicham.ilakkanam.models.seer.Seer;
import grammar.Yaappu.VenbaBaseVisitor;
import grammar.Yaappu.VenbaParser;

import java.util.LinkedList;
import java.util.List;

public class AdiVisitor extends VenbaBaseVisitor<Adi> {
    SeerVisitor seerVisitor;
    public AdiVisitor() {
        seerVisitor=new SeerVisitor();
    }

    @Override
    public Adi visitAdi(VenbaParser.AdiContext ctx) {
        List<VenbaParser.SeerContext> seergal = ctx.seer();

        List<Seer> seers=new LinkedList<>();
        for(VenbaParser.SeerContext seerContext: seergal){
            seers.add(seerVisitor.visitSeer(seerContext));
        }
        return Adi.getAdi(seers.toArray(new Seer[0]));
    }

    @Override
    public Adi visitEetradi(VenbaParser.EetradiContext ctx) {
        List<VenbaParser.SeerContext> seergal = ctx.seer();

        List<Seer> seers=new LinkedList<>();
        for(VenbaParser.SeerContext seerContext: seergal){
            seers.add(seerVisitor.visitSeer(seerContext));
        }

        EetruSeer eetruSeer=seerVisitor.visitEetru_seer(ctx.eetru_seer());
        seers.add(eetruSeer);

        return Adi.getEetraAdi(seers.toArray(new Seer[0]));
    }
}
