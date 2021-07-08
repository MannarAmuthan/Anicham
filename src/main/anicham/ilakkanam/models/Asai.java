package anicham.ilakkanam.models;

import anicham.ilakkanam.types.AsaiType;

import java.util.Arrays;
import java.util.Objects;

public class Asai {
    AsaiType type;
    Oasai[] ozhigal;

    private Asai(AsaiType type, Oasai[] ozhigal){
        this.ozhigal=ozhigal;
        this.type=type;
    }
    public static Asai getNerAsai(Oasai... ozhigal){
       return new Asai(AsaiType.NER,ozhigal);
    }

    public static Asai getNiraiAsai(Oasai... ozhigal){
        return new Asai(AsaiType.NIRAI,ozhigal);
    }

    public AsaiType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asai asai = (Asai) o;
        return Objects.equals(type, asai.type) &&
                Arrays.equals(ozhigal, asai.ozhigal);
    }
}
