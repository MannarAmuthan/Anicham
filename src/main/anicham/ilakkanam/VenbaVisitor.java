package anicham.ilakkanam;

import anicham.ilakkanam.models.Adi;
import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.models.Ozhi;
import anicham.ilakkanam.models.Venba;
import anicham.ilakkanam.models.seer.EerasaiSeer;
import anicham.ilakkanam.models.seer.EetruSeer;
import anicham.ilakkanam.models.seer.MoovasaiSeer;
import anicham.ilakkanam.models.seer.Seer;
import grammar.Yaappu.VenbaBaseVisitor;
import grammar.Yaappu.VenbaParser;

import java.util.LinkedList;
import java.util.List;

public class VenbaVisitor extends VenbaBaseVisitor<Object> {
    @Override
    public Venba visitVenpa(VenbaParser.VenpaContext ctx) {
        List<VenbaParser.AdiContext> adigal = ctx.adi();
        List<Adi> adiList=new LinkedList<>();

        for(VenbaParser.AdiContext adiContext: adigal){
            adiList.add(visitAdi(adiContext));
        }
        Adi eeru=visitEetradi(ctx.eetradi());

        return new Venba(adiList.toArray(new Adi[0]),eeru);
    }

    @Override
    public Adi visitAdi(VenbaParser.AdiContext ctx) {
        List<VenbaParser.SeerContext> seergal = ctx.seer();

        List<Seer> seers=new LinkedList<>();
        for(VenbaParser.SeerContext seerContext: seergal){
            seers.add(visitSeer(seerContext));
        }
        return Adi.getAdi(seers.toArray(new Seer[0]));
    }

    @Override
    public Adi visitEetradi(VenbaParser.EetradiContext ctx) {
        List<VenbaParser.SeerContext> seergal = ctx.seer();

        List<Seer> seers=new LinkedList<>();
        for(VenbaParser.SeerContext seerContext: seergal){
            seers.add(visitSeer(seerContext));
        }

        EetruSeer eetruSeer=visitEetru_seer(ctx.eetru_seer());
        seers.add(eetruSeer);

        return Adi.getEetraAdi(seers.toArray(new Seer[0]));
    }

    @Override
    public Seer visitSeer(VenbaParser.SeerContext ctx) {

        if(ctx.eerasai()!=null){
            return visitEerasai(ctx.eerasai());
        }
        else {
            return visitMoovasai(ctx.moovasai());
        }
    }

    @Override
    public MoovasaiSeer visitMoovasai(VenbaParser.MoovasaiContext ctx) {
        if(ctx.themangai()!=null) return visitThemangai(ctx.themangai());
        if(ctx.themangani()!=null) return visitThemangani(ctx.themangani());
        if(ctx.pulimangai()!=null) return visitPulimangai(ctx.pulimangai());
        if(ctx.pulimangani()!=null) return visitPulimangani(ctx.pulimangani());
        if(ctx.koovilangai()!=null) return visitKoovilangai(ctx.koovilangai());
        if(ctx.koovilangani()!=null) return visitKoovilangani(ctx.koovilangani());
        if(ctx.karuvilangai()!=null) return visitKaruvilangai(ctx.karuvilangai());
        return visitKaruvilangani(ctx.karuvilangani());
    }

    @Override
    public EerasaiSeer visitEerasai(VenbaParser.EerasaiContext ctx) {
        if(ctx.thema()!=null) return visitThema(ctx.thema());
        if(ctx.pulima()!=null) return visitPulima(ctx.pulima());
        if(ctx.koovilam()!=null) return visitKoovilam(ctx.koovilam());
        return visitKaruvilam(ctx.karuvilam());
    }

    @Override
    public MoovasaiSeer visitThemangai(VenbaParser.ThemangaiContext ctx) {
        Asai[] asais = visitThema(ctx.thema()).getAsaigal();
        Asai asai3=visitNer_asai(ctx.ner_asai());
        return MoovasaiSeer.getThemangai(asais[0],asais[1],asai3);
    }

    @Override
    public MoovasaiSeer visitThemangani(VenbaParser.ThemanganiContext ctx) {
        Asai[] asais = visitThema(ctx.thema()).getAsaigal();
        Asai asai3=visitNirai_asai(ctx.nirai_asai());
        return MoovasaiSeer.getThemangani(asais[0],asais[1],asai3);
    }

    @Override
    public MoovasaiSeer visitPulimangai(VenbaParser.PulimangaiContext ctx) {
        Asai[] asais = visitPulima(ctx.pulima()).getAsaigal();
        Asai asai3=visitNer_asai(ctx.ner_asai());
        return MoovasaiSeer.getPulimangai(asais[0],asais[1],asai3);
    }

    @Override
    public MoovasaiSeer visitPulimangani(VenbaParser.PulimanganiContext ctx) {
        Asai[] asais = visitPulima(ctx.pulima()).getAsaigal();
        Asai asai3=visitNirai_asai(ctx.nirai_asai());
        return MoovasaiSeer.getPulimangani(asais[0],asais[1],asai3);
    }

    @Override
    public MoovasaiSeer visitKoovilangai(VenbaParser.KoovilangaiContext ctx) {
        Asai[] asais = visitKoovilam(ctx.koovilam()).getAsaigal();
        Asai asai3=visitNer_asai(ctx.ner_asai());
        return MoovasaiSeer.getKoovilangai(asais[0],asais[1],asai3);
    }

    @Override
    public MoovasaiSeer visitKoovilangani(VenbaParser.KoovilanganiContext ctx) {
        Asai[] asais = visitKoovilam(ctx.koovilam()).getAsaigal();
        Asai asai3=visitNirai_asai(ctx.nirai_asai());
        return MoovasaiSeer.getKoovilangani(asais[0],asais[1],asai3);
    }

    @Override
    public MoovasaiSeer visitKaruvilangai(VenbaParser.KaruvilangaiContext ctx) {
        Asai[] asais = visitKaruvilam(ctx.karuvilam()).getAsaigal();
        Asai asai3=visitNer_asai(ctx.ner_asai());
        return MoovasaiSeer.getKaruvilangai(asais[0],asais[1],asai3);
    }

    @Override
    public MoovasaiSeer visitKaruvilangani(VenbaParser.KaruvilanganiContext ctx) {
        Asai[] asais = visitKaruvilam(ctx.karuvilam()).getAsaigal();
        Asai asai3=visitNirai_asai(ctx.nirai_asai());
        return MoovasaiSeer.getKaruvilangani(asais[0],asais[1],asai3);
    }

    @Override
    public EerasaiSeer visitThema(VenbaParser.ThemaContext ctx) {
        List<VenbaParser.Ner_asaiContext> ner_asaiContexts = ctx.ner_asai();

        List<Asai> asais=new LinkedList<>();

        for(VenbaParser.Ner_asaiContext ner_asaiContext: ner_asaiContexts){
            asais.add(visitNer_asai(ner_asaiContext));
        }

        return EerasaiSeer.getThema(asais.toArray(new Asai[0]));
    }

    @Override
    public EerasaiSeer visitPulima(VenbaParser.PulimaContext ctx) {
        List<Asai> asais=new LinkedList<>();

        VenbaParser.Ner_asaiContext ner_asaiContext = ctx.ner_asai();
        VenbaParser.Nirai_asaiContext nirai_asaiContext = ctx.nirai_asai();

        asais.add(visitNirai_asai(nirai_asaiContext));
        asais.add(visitNer_asai(ner_asaiContext));

        return EerasaiSeer.getPulima(asais.toArray(new Asai[0]));
    }

    @Override
    public EerasaiSeer visitKoovilam(VenbaParser.KoovilamContext ctx) {
        List<Asai> asais=new LinkedList<>();

        VenbaParser.Ner_asaiContext ner_asaiContext = ctx.ner_asai();
        VenbaParser.Nirai_asaiContext nirai_asaiContext = ctx.nirai_asai();

        asais.add(visitNer_asai(ner_asaiContext));
        asais.add(visitNirai_asai(nirai_asaiContext));


        return EerasaiSeer.getKoovilam(asais.toArray(new Asai[0]));
    }

    @Override
    public EerasaiSeer visitKaruvilam(VenbaParser.KaruvilamContext ctx) {
        List<VenbaParser.Nirai_asaiContext> nirai_asaiContexts = ctx.nirai_asai();

        List<Asai> asais=new LinkedList<>();

        for(VenbaParser.Nirai_asaiContext nirai_asaiContext: nirai_asaiContexts){
            asais.add(visitNirai_asai(nirai_asaiContext));
        }

        return EerasaiSeer.getKaruvilam(asais.toArray(new Asai[0]));
    }

    @Override
    public EetruSeer visitEetru_seer(VenbaParser.Eetru_seerContext ctx) {
        if(ctx.ner_asai()!=null){
            return EetruSeer.getNaal(visitNer_asai(ctx.ner_asai()));
        }
        if(ctx.nirai_asai()!=null){
            return EetruSeer.getMalar(visitNirai_asai(ctx.nirai_asai()));
        }
        if(ctx.pulima()!=null){
            return EetruSeer.getPirappu(visitPulima(ctx.pulima()).getAsaigal());
        }
        return EetruSeer.getKaasu(visitThema(ctx.thema()).getAsaigal());
    }

    @Override
    public Asai visitNirai_asai(VenbaParser.Nirai_asaiContext ctx) {
        List<Ozhi> ozhis=new LinkedList<>();

        List<VenbaParser.KurilContext> kurilkal = ctx.kuril();
        for(VenbaParser.KurilContext kurilC: kurilkal){
            ozhis.add(visitKuril(kurilC));
        }

        if(ctx.nedil()!=null){
            ozhis.add(visitNedil(ctx.nedil()));
        }
        List<VenbaParser.OtruContext> otrukal = ctx.otru();
        for(VenbaParser.OtruContext oruC: otrukal){
            ozhis.add(visitOtru(oruC));
        }
        return Asai.getNiraiAsai(ozhis.toArray(new Ozhi[0]));
    }

    @Override
    public Asai visitNer_asai(VenbaParser.Ner_asaiContext ctx) {
        List<Ozhi> ozhis=new LinkedList<>();

        if(ctx.kuril()!=null){
            ozhis.add(visitKuril(ctx.kuril()));
        }
        if(ctx.nedil()!=null){
            ozhis.add(visitNedil(ctx.nedil()));
        }
        List<VenbaParser.OtruContext> otrukal = ctx.otru();
        for(VenbaParser.OtruContext oruC: otrukal){
            ozhis.add(visitOtru(oruC));
        }
        return Asai.getNerAsai(ozhis.toArray(new Ozhi[0]));
    }

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
};
