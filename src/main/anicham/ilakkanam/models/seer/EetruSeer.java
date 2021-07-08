package anicham.ilakkanam.models.seer;

import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.types.SeerType;

public class EetruSeer extends Seer {

    private EetruSeer(SeerType type, Asai[] asaigal) {
        super(type, asaigal);
    }

    public static EetruSeer getNaal(Asai... asaigal){
        return new EetruSeer(SeerType.NAAL,asaigal);
    }

    public static EetruSeer getMalar(Asai... asaigal){
        return new EetruSeer(SeerType.MALAR,asaigal);
    }

    public static EetruSeer getKaasu(Asai... asaigal){
        return new EetruSeer(SeerType.KAASU,asaigal);
    }

    public static EetruSeer getPirappu(Asai... asaigal){
        return new EetruSeer(SeerType.PIRAPPU,asaigal);
    }

}
