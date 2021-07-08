package anicham.ilakkanam.models.seer;

import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.types.SeerType;

public class MoovasaiSeer extends Seer {

    private MoovasaiSeer(SeerType type, Asai[] asaigal) {
        super(type,asaigal);
    }

    public static MoovasaiSeer getThemangai(Asai... asaigal){
        return new MoovasaiSeer(SeerType.THEMANGAI,asaigal);
    }

    public static MoovasaiSeer getThemangani(Asai... asaigal){
        return new MoovasaiSeer(SeerType.THEMANGANI,asaigal);
    }

    public static MoovasaiSeer getPulimangai(Asai... asaigal){
        return new MoovasaiSeer(SeerType.PULIMANGAI,asaigal);
    }

    public static MoovasaiSeer getPulimangani(Asai... asaigal){
        return new MoovasaiSeer(SeerType.PULIMANGANI,asaigal);
    }

    public static MoovasaiSeer getKoovilangai(Asai... asaigal){
        return new MoovasaiSeer(SeerType.KOOVILANGAI,asaigal);
    }

    public static MoovasaiSeer getKoovilangani(Asai... asaigal){
        return new MoovasaiSeer(SeerType.KOOVILANGANI,asaigal);
    }

    public static MoovasaiSeer getKaruvilangai(Asai... asaigal){
        return new MoovasaiSeer(SeerType.KARUVILANGAI,asaigal);
    }

    public static MoovasaiSeer getKaruvilangani(Asai... asaigal){
        return new MoovasaiSeer(SeerType.KARUVILANGANI,asaigal);
    }

}
