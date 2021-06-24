/**
 * @author Amuthan Mannan
 */

import language.models.Vaakiyam;
import language.models.Vaarthai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Processed {
    Vaakiyam vaakiyam;

    public Processed(Vaakiyam vaakiyam) {
        this.vaakiyam = vaakiyam;
    }

    public Vaakiyam vaakiyam() {
        return vaakiyam;
    }

    public Vaarthai[] vaarthaigal() {
        Object[] objects = vaakiyam.vaarthaigal().toArray();
        return Arrays.copyOf(objects, objects.length, Vaarthai[].class);
    }

    public String[] eluthukkal() {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<Vaarthai> vaarthaigal = vaakiyam.vaarthaigal();
        for (Vaarthai v : vaarthaigal) {
            arrayList.addAll(v.elutthukkal());
        }
        Object[] strings = arrayList.toArray();
        return Arrays.copyOf(strings, strings.length, String[].class);
    }
}
