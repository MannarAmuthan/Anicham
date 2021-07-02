package anicham.ilakkanam.models.seer;

import anicham.ilakkanam.models.Asai;

public class EerasaiSeer extends Seer {

    private EerasaiSeer(String type, Asai[] asaigal) {
        super(type,asaigal);
    }

    public static EerasaiSeer getThema(Asai... asaigal){
        return new EerasaiSeer("THEMA",asaigal);
    }

    public static EerasaiSeer getPulima(Asai... asaigal){
        return new EerasaiSeer("PULIMA",asaigal);
    }

    public static EerasaiSeer getKoovilam(Asai... asaigal){
        return new EerasaiSeer("KOOVILAM",asaigal);
    }

    public static EerasaiSeer getKaruvilam(Asai... asaigal){
        return new EerasaiSeer("KARUVILAM",asaigal);
    }

}
