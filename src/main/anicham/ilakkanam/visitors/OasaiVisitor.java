package anicham.ilakkanam.visitors;

import anicham.ilakkanam.models.Oasai;
import grammar.Yaappu.VenbaBaseVisitor;
import grammar.Yaappu.VenbaParser;

public class OasaiVisitor extends VenbaBaseVisitor<Oasai> {
    @Override
    public Oasai visitKuril(VenbaParser.KurilContext ctx) {
        if(ctx.exception!=null) return null;
        return Oasai.KURIL;
    }

    @Override
    public Oasai visitNedil(VenbaParser.NedilContext ctx) {
        if(ctx.exception!=null) return null;
        return Oasai.NEDIL;
    }

    @Override
    public Oasai visitOtru(VenbaParser.OtruContext ctx) {
        if(ctx.exception!=null) return null;
        return Oasai.OTRU;
    }
}
