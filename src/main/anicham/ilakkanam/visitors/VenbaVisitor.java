package anicham.ilakkanam.visitors;

import anicham.ilakkanam.models.Adi;
import anicham.ilakkanam.models.Venba;
import grammar.Yaappu.VenbaBaseVisitor;
import grammar.Yaappu.VenbaParser;

import java.util.LinkedList;
import java.util.List;

public class VenbaVisitor extends VenbaBaseVisitor<Venba> {
    AdiVisitor adiVisitor;

    public VenbaVisitor() {
        adiVisitor=new AdiVisitor();
    }

    @Override
    public Venba visitVenpa(VenbaParser.VenpaContext ctx) {
        List<VenbaParser.AdiContext> adigal = ctx.adi();
        List<Adi> adiList=new LinkedList<>();

        for(VenbaParser.AdiContext adiContext: adigal){
            adiList.add(adiVisitor.visitAdi(adiContext));
        }
        Adi eeru=adiVisitor.visitEetradi(ctx.eetradi());
        return new Venba(adiList.toArray(new Adi[0]),eeru);
    }
};
