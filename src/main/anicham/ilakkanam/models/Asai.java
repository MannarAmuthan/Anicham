package anicham.ilakkanam.models;

import java.util.Arrays;
import java.util.Objects;

public class Asai {
    String type;
    Ozhi[] ozhigal;

    private Asai(String type,Ozhi[] ozhigal){
        this.ozhigal=ozhigal;
        this.type=type;
    }
    public static Asai getNerAsai(Ozhi... ozhigal){
       return new Asai("NER",ozhigal);
    }

    public static Asai getNiraiAsai(Ozhi... ozhigal){
        return new Asai("NIRAI",ozhigal);
    }

    public String getType() {
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
