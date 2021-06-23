package language;

import java.util.LinkedList;

public class vaakiyam {
    LinkedList<Vaarthai> words;

    public vaakiyam() {
        words = new LinkedList<>();
    }

    public void add(vaakiyam vaakiyam) {
        words.addAll(vaakiyam.words);
    }

    public void add(Vaarthai vaarthai) {
        words.add(vaarthai);
    }
}
