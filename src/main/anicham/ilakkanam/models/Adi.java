package anicham.ilakkanam.models;

import anicham.ilakkanam.models.seer.Seer;
import anicham.ilakkanam.types.AdiType;

public class Adi {
    AdiType type;
    Seer[] seergal;

    private Adi(AdiType type,Seer[] seergal) {
        this.type = type;
        this.seergal = seergal;
    }

    public static Adi getAdi(Seer[] seergal){
        return new Adi(AdiType.ADI,seergal);
    }

    public static Adi getEetraAdi(Seer[] seergal){
        return new Adi(AdiType.EETRADI,seergal);
    }

    public AdiType getType() {
        return type;
    }

    public Seer[] getSeergal() {
        return seergal;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        Adi other=(Adi) obj;
        for(int i=0;i< seergal.length;i++){
            if(!other.seergal[i].equals(seergal[i])) return false;
        }
        return type.equals(other.type);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i< seergal.length;i++){
            if(i == seergal.length-1) stringBuilder.append(seergal[i].toString());
            else stringBuilder.append(seergal[i].toString()).append(" ");
        }

        return stringBuilder.toString();
    }
}
