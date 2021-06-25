package language.models.sol;

import language.exceptions.SolException;

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
        List<String> stringList = new LinkedList<>();
        for (int i = startIndex; i < endIndex; i++) {
            stringList.add(sol.ezhutthukkal().get(i));
        }
        return new Sol(stringList);
    }

}
