package anicham.ilakkanam.models.seer;

import anicham.ilakkanam.models.Asai;

public class EetruSeer extends Seer {

    private EetruSeer(String type, Asai[] asaigal) {
        super(type, asaigal);
    }

    public static EetruSeer getNaal(Asai... asaigal){
        return new EetruSeer("NAAL",asaigal);
    }

    public static EetruSeer getMalar(Asai... asaigal){
        return new EetruSeer("MALAR",asaigal);
    }

    public static EetruSeer getKaasu(Asai... asaigal){
        return new EetruSeer("KAASU",asaigal);
    }

    public static EetruSeer getPirappu(Asai... asaigal){
        return new EetruSeer("PIRAPPU",asaigal);
    }

}
