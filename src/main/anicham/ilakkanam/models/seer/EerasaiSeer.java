package anicham.ilakkanam.models.seer;

import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.types.SeerType;

public class EerasaiSeer extends Seer {

    private EerasaiSeer(SeerType type, Asai[] asaigal) {
        super(type,asaigal);
    }

    public static EerasaiSeer getThema(Asai... asaigal){
        return new EerasaiSeer(SeerType.THEMA,asaigal);
    }

    public static EerasaiSeer getPulima(Asai... asaigal){
        return new EerasaiSeer(SeerType.PULIMA,asaigal);
    }

    public static EerasaiSeer getKoovilam(Asai... asaigal){
        return new EerasaiSeer(SeerType.KOOVILAM,asaigal);
    }

    public static EerasaiSeer getKaruvilam(Asai... asaigal){
        return new EerasaiSeer(SeerType.KARUVILAM,asaigal);
    }

}
