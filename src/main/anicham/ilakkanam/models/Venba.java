package anicham.ilakkanam.models;

import java.util.Arrays;

public class Venba {
    Adi[] adigal;
    Adi eeru;

    public Venba(Adi[] adigal, Adi eeru) {
        this.adigal = adigal;
        this.eeru = eeru;
    }

    public Adi[] getAdigal() {
        return adigal;
    }

    public Adi getEeru() {
        return eeru;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        Venba other=(Venba) obj;
        for(int i=0;i< adigal.length;i++){
            if(!other.adigal[i].equals(adigal[i])) return false;
        }
        return eeru.equals(other.eeru);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        for(Adi a: adigal){
            stringBuilder.append(a.toString()).append("\n");
        }
        stringBuilder.append(eeru.toString());
        return stringBuilder.toString();
    }
}
