/**
 * @author Amuthan Mannan
 */

import language.models.Vaakiyam;
import language.models.sol.Sol;

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

    public Sol[] vaarthaigal() {
        Object[] objects = vaakiyam.sorkkal().toArray();
        return Arrays.copyOf(objects, objects.length, Sol[].class);
    }

    public String[] eluthukkal() {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<Sol> vaarthaigal = vaakiyam.sorkkal();
        for (Sol v : vaarthaigal) {
            arrayList.addAll(v.ezhutthukkal());
        }
        Object[] strings = arrayList.toArray();
        return Arrays.copyOf(strings, strings.length, String[].class);
    }
}
