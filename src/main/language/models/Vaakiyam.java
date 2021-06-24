/**
 * @author Amuthan Mannan
 */

package language.models;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Vaakiyam {
    LinkedList<Vaarthai> words;

    public Vaakiyam() {
        words = new LinkedList<>();
    }

    public void add(Vaakiyam vaakiyam) {
        words.addAll(vaakiyam.words);
    }

    public void add(Vaarthai vaarthai) {
        words.add(vaarthai);
    }

    public int vaarthaigalCount(){
        return words.size();
    }

    public LinkedList<Vaarthai> vaarthaigal() {
        return words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vaakiyam vaakiyam = (Vaakiyam) o;
        if(vaakiyam.vaarthaigalCount() != words.size()) return false;

        int size=words.size();
        List<Vaarthai> elutthukkal = vaakiyam.vaarthaigal();
        for(int i=0;i<size;i++){
            if(!elutthukkal.get(i).equals(words.get(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
