package language;

import grammar.TamizhParser;

import java.util.LinkedList;
import java.util.List;

public class Vaarthai {
    List<String> letters;


    public Vaarthai() {
        letters = new LinkedList<>();
    }

    void add(String s) {
        letters.add(s);
    }
}
