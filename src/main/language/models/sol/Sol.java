/**
 * @author Amuthan Mannan
 */

package language.models.sol;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Sol {
    private final List<String> letters;

    public Sol(List<String> letters) {
        this.letters = letters;
    }

    public Sol(String... ezhutthukkal) {
        letters = new LinkedList<>();
        Collections.addAll(letters, ezhutthukkal);
    }

    public int ezhutthuCount() {
        return letters.size();
    }

    public List<String> ezhutthukkal() {
        return letters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sol sol = (Sol) o;
        if (sol.ezhutthuCount() != letters.size()) return false;

        int size = letters.size();
        List<String> ezhutthukkal = sol.ezhutthukkal();
        for (int i = 0; i < size; i++) {
            if (!ezhutthukkal.get(i).equals(letters.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letters);
    }

}
