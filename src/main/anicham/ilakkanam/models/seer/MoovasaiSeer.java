package anicham.ilakkanam.models.seer;

import anicham.ilakkanam.models.Asai;

public class MoovasaiSeer extends Seer {

    private MoovasaiSeer(String type, Asai[] asaigal) {
        super(type,asaigal);
    }

    public static MoovasaiSeer getThemangai(Asai... asaigal){
        return new MoovasaiSeer("THEMANGAI",asaigal);
    }

    public static MoovasaiSeer getThemangani(Asai... asaigal){
        return new MoovasaiSeer("THEMANGANI",asaigal);
    }

    public static MoovasaiSeer getPulimangai(Asai... asaigal){
        return new MoovasaiSeer("PULIMANGAI",asaigal);
    }

    public static MoovasaiSeer getPulimangani(Asai... asaigal){
        return new MoovasaiSeer("PULIMANGANI",asaigal);
    }

    public static MoovasaiSeer getKoovilangai(Asai... asaigal){
        return new MoovasaiSeer("KOOVILANGAI",asaigal);
    }

    public static MoovasaiSeer getKoovilangani(Asai... asaigal){
        return new MoovasaiSeer("KOOVILANGANI",asaigal);
    }

    public static MoovasaiSeer getKaruvilangai(Asai... asaigal){
        return new MoovasaiSeer("KARUVILANGAI",asaigal);
    }

    public static MoovasaiSeer getKaruvilangani(Asai... asaigal){
        return new MoovasaiSeer("KARUVILANGAI",asaigal);
    }

}
