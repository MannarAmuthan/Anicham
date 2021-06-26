package anicham; /**
 * @author Amuthan Mannan
 */

import anicham.language.models.Patthi;
import anicham.language.models.Vaakiyam;
import anicham.language.models.ezhuththu.Ezhuththu;
import anicham.language.models.sol.Sol;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Processed {
    List<Patthi> patthigal;

    public Processed(List<Patthi> patthigal) {
        this.patthigal=patthigal;
    }

    public Patthi[] getPatthigal() {
        Object[] patthigal = this.patthigal.toArray();
        return Arrays.copyOf(patthigal, patthigal.length, Patthi[].class);
    }

    public Vaakiyam[] vaakiyangal() {
        List<Vaakiyam> vaakiyangal=new LinkedList<>();
        for(Patthi p:patthigal){
            vaakiyangal.addAll(p.getVaakiyangal());
        }
        Object[] objects = vaakiyangal.toArray();
        return Arrays.copyOf(objects, objects.length, Vaakiyam[].class);
    }

    public Sol[] sorkkal() {
        Vaakiyam[] vaakiyangal=vaakiyangal();
        List<Sol> sorkkal=new LinkedList<>();
        for(Vaakiyam v:vaakiyangal){
            sorkkal.addAll(v.sorkkal());
        }
        Object[] objects = sorkkal.toArray();
        return Arrays.copyOf(objects, objects.length, Sol[].class);
    }

    public Ezhuththu[] ezhuththukkal() {
        Sol[] sorkkal=sorkkal();
        List<Ezhuththu> ezhuththukkal = new LinkedList<>();
        for (Sol s : sorkkal) {
            ezhuththukkal.addAll(s.ezhutthukkal());
        }
        Object[] strings = ezhuththukkal.toArray();
        return Arrays.copyOf(strings, strings.length, Ezhuththu[].class);
    }
}
