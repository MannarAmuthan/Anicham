package anicham.ilakkanam.visitors;

import anicham.ilakkanam.models.Oasai;
import grammar.Yaappu.VenbaBaseVisitor;
import grammar.Yaappu.VenbaParser;

public class OzhiVisitor extends VenbaBaseVisitor<Oasai> {
    @Override
    public Oasai visitKuril(VenbaParser.KurilContext ctx) {
        return Oasai.kuril;
    }

    @Override
    public Oasai visitNedil(VenbaParser.NedilContext ctx) {
        return Oasai.nedil;
    }

    @Override
    public Oasai visitOtru(VenbaParser.OtruContext ctx) {
        return Oasai.otru;
    }
}
