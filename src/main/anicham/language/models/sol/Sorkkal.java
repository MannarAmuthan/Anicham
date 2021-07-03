package anicham.language.models.sol;

import anicham.language.exceptions.SolException;
import anicham.language.models.ezhuththu.Ezhuththu;
import anicham.language.models.ezhuththu.EzhuththuType;

import java.util.LinkedList;
import java.util.List;

public class Sorkkal {

    static public Sol substring(Sol sol, int startIndex, int endIndex) {
        if (startIndex < 0) {
            throw new SolException("Negative indices found");
        }
        if (startIndex >= sol.ezhutthuCount() || endIndex > sol.ezhutthuCount()) {
            throw new SolException("Index out of bound");
        }
        List<Ezhuththu> ezhuththuList = new LinkedList<>();
        for (int i = startIndex; i < endIndex; i++) {
            ezhuththuList.add(sol.ezhutthukkal().get(i));
        }
        return new Sol(ezhuththuList);
    }

    static public Sol reverse(Sol sol) {
        List<Ezhuththu> ezhuththuList = new LinkedList<>();
        for (int i = sol.ezhutthuCount() - 1; i > -1; i--) {
            ezhuththuList.add(sol.ezhutthukkal().get(i));
        }
        return new Sol(ezhuththuList);
    }

    static public Sol remove(Sol sol, int index) {
        if (index < 0 || index >= sol.ezhutthuCount()) {
            throw new SolException("Invalid index for Sol : " + index);
        }
        List<Ezhuththu> ezhuththuList = new LinkedList<>();

        for (int i = 0; i < sol.ezhutthuCount(); i++) {
            if (i == index) continue;
            ezhuththuList.add(sol.ezhutthukkal().get(i));
        }
        return new Sol(ezhuththuList);
    }

    static public Ezhuththu ezhuththuAt(Sol sol, int position) {
        if (position < 0 || position >= sol.ezhutthuCount()) {
            throw new SolException("Invalid position for Sol : " + position);
        }

        return sol.ezhutthukkal().get(position);
    }

    static public long countTypeOf(Sol sol, EzhuththuType ezhuththuType){
        return sol.ezhutthukkal()
                .parallelStream()
                .filter(ezhuththu ->ezhuththu.getEzhuththuType()==ezhuththuType)
                .count();
    }


}
