package anicham.ilakkanam.models.seer;

import anicham.ilakkanam.models.Adi;
import anicham.ilakkanam.models.Asai;

import java.util.Arrays;
import java.util.Objects;

public class Seer {
    String type;
    Asai[] asaigal;

    Seer(String type,Asai[] asaigal) {
        this.type=type;
        this.asaigal = asaigal;
    }

    public Asai[] getAsaigal() {
        return asaigal;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seer seer = (Seer) o;
        return Objects.equals(type, seer.type) &&
                Arrays.equals(asaigal, seer.asaigal);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(type);
        result = 31 * result + Arrays.hashCode(asaigal);
        return result;
    }

    @Override
    public String toString() {
        return getType();
    }
}
