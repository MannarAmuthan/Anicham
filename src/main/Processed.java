/**
 * @author Amuthan Mannan
 */

import language.models.Patthi;
import language.models.Vaakiyam;
import language.models.sol.Sol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Processed {
    List<Patthi> patthigal;

    public Processed(List<Patthi> patthigal) {
        this.patthigal=patthigal;
    }

    public List<Patthi> getPatthigal() {
        return patthigal;
    }

    public List<Vaakiyam> vaakiyangal() {
        List<Vaakiyam> vaakiyangal=new LinkedList<>();
        for(Patthi p:patthigal){
            vaakiyangal.addAll(p.getVaakiyangal());
        }
        return vaakiyangal;
    }

    public Sol[] sorkkal() {
        List<Vaakiyam> vaakiyangal=vaakiyangal();
        List<Sol> sorkkal=new LinkedList<>();
        for(Vaakiyam v:vaakiyangal){
            sorkkal.addAll(v.sorkkal());
        }
        Object[] objects = sorkkal.toArray();
        return Arrays.copyOf(objects, objects.length, Sol[].class);
    }

    public String[] ezhuththukkal() {
        Sol[] sorkkal=sorkkal();
        List<String> ezhuththukkal = new LinkedList<>();
        for (Sol s : sorkkal) {
            ezhuththukkal.addAll(s.ezhutthukkal());
        }
        Object[] strings = ezhuththukkal.toArray();
        return Arrays.copyOf(strings, strings.length, String[].class);
    }
}
