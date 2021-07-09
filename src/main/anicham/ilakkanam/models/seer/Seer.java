package anicham.ilakkanam.models.seer;

import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.types.SeerType;

import java.util.Arrays;
import java.util.Objects;

public class Seer {
    SeerType type;
    Asai[] asaigal;

    Seer(SeerType type,Asai[] asaigal) {
        this.type=type;
        this.asaigal = asaigal;
    }

    public Asai[] getAsaigal() {
        return asaigal;
    }

    public SeerType getType() {
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
    public String toString() {
        return getType().toString();
    }
}
