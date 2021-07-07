package anicham.ilakkanam.visitors;

import anicham.ilakkanam.models.Ozhi;
import grammar.Yaappu.VenbaBaseVisitor;
import grammar.Yaappu.VenbaParser;

public class OzhiVisitor extends VenbaBaseVisitor<Ozhi> {
    @Override
    public Ozhi visitKuril(VenbaParser.KurilContext ctx) {
        return Ozhi.kuril;
    }

    @Override
    public Ozhi visitNedil(VenbaParser.NedilContext ctx) {
        return Ozhi.nedil;
    }

    @Override
    public Ozhi visitOtru(VenbaParser.OtruContext ctx) {
        return Ozhi.otru;
    }
}
