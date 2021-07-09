/**
 * @author Amuthan Mannan
 */

package anicham.language.models.sol;

import anicham.language.models.ezhuththu.Ezhuththu;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Sol {
    private final List<Ezhuththu> letters;

    public Sol(List<Ezhuththu> letters) {
        this.letters = letters;
    }

    public int ezhutthuCount() {
        return letters.size();
    }

    public List<Ezhuththu> ezhutthukkal() {
        return letters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sol sol = (Sol) o;
        if (sol.ezhutthuCount() != letters.size()) return false;

        int size = letters.size();
        List<Ezhuththu> ezhutthukkal = sol.ezhutthukkal();
        for (int i = 0; i < size; i++) {
            if (!ezhutthukkal.get(i).equals(letters.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        ezhutthukkal().forEach(ezhuththu -> stringBuilder.append(ezhuththu.toString()));
        return stringBuilder.toString();
    }

}
