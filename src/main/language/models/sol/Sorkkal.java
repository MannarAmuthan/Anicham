package language.models.sol;

import language.exceptions.SolException;
import language.models.ezhuththu.Ezhuththu;

import java.util.LinkedList;
import java.util.List;

public class Sorkkal {

    static public Sol substring(Sol sol, int startIndex, int endIndex) throws SolException {
        if (startIndex < 0) {
            throw new SolException("Negative indices found");
        }
        if (startIndex >= sol.ezhutthuCount() || endIndex > sol.ezhutthuCount()) {
            throw new SolException("Index out of bound");
        }
        List<Ezhuththu> stringList = new LinkedList<>();
        for (int i = startIndex; i < endIndex; i++) {
            stringList.add(sol.ezhutthukkal().get(i));
        }
        return new Sol(stringList);
    }

    static public Sol reverse(Sol sol){
        List<Ezhuththu> stringList = new LinkedList<>();
        for (int i = sol.ezhutthuCount()-1; i > -1; i--) {
            stringList.add(sol.ezhutthukkal().get(i));
        }
        return new Sol(stringList);
    }

    static public Sol remove(Sol sol,int index) throws SolException {
        if (index < 0 || index>=sol.ezhutthuCount()) {
            throw new SolException("Invalid index for Sol : "+index);
        }
        List<Ezhuththu> stringList = new LinkedList<>();
        for (int i = 0; i < sol.ezhutthuCount(); i++) {
            if(i==index) continue;
            stringList.add(sol.ezhutthukkal().get(i));
        }
        return new Sol(stringList);
    }

}
