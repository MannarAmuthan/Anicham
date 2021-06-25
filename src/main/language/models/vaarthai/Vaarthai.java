/**
 * @author Amuthan Mannan
 */

package language.models.vaarthai;

import language.exceptions.VaarthaiException;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Vaarthai {
    private List<String> letters;

    public Vaarthai(List<String> letters) {
        this.letters = letters;
    }

    public Vaarthai(String... eluthukkal) {
        letters = new LinkedList<>();
        Collections.addAll(letters, eluthukkal);
    }

    public int elutthuCount() {
        return letters.size();
    }

    public List<String> elutthukkal() {
        return letters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vaarthai vaarthai = (Vaarthai) o;
        if (vaarthai.elutthuCount() != letters.size()) return false;

        int size = letters.size();
        List<String> elutthukkal = vaarthai.elutthukkal();
        for (int i = 0; i < size; i++) {
            if (!elutthukkal.get(i).equals(letters.get(i))) {
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
