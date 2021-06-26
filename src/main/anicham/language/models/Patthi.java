package anicham.language.models;

import java.util.LinkedList;

public class Patthi {
    LinkedList<Vaakiyam> vaakiyangal;

    public Patthi() {
        this.vaakiyangal = new LinkedList<>();
    }

    public void add(Vaakiyam vaakiyam){
        vaakiyangal.add(vaakiyam);
    }

    public void add(Patthi patthi){
        vaakiyangal.addAll(patthi.vaakiyangal);
    }

    public LinkedList<Vaakiyam> getVaakiyangal() {
        return vaakiyangal;
    }
}
