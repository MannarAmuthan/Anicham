/**
 * @author Amuthan Mannan
 */

package anicham.language.models;

import anicham.language.models.sol.Sol;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Vaakiyam {
    LinkedList<Sol> words;

    public Vaakiyam() {
        words = new LinkedList<>();
    }

    public void add(Sol... sol) {
        words.addAll(Arrays.asList(sol));
    }

    public void add(Vaakiyam vaakiyam){
        words.addAll(vaakiyam.words);
    }

    public int sorkkalCount(){
        return words.size();
    }

    public LinkedList<Sol> sorkkal() {
        return words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vaakiyam vaakiyam = (Vaakiyam) o;
        if(vaakiyam.sorkkalCount() != words.size()) return false;

        int size=words.size();
        List<Sol> sorkkal = vaakiyam.sorkkal();
        for(int i=0;i<size;i++){
            if(!sorkkal.get(i).equals(words.get(i))){
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
