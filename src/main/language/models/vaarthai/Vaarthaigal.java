package language.models.vaarthai;

import language.exceptions.VaarthaiException;

import java.util.LinkedList;
import java.util.List;

public class Vaarthaigal {

    static public Vaarthai substring(Vaarthai vaarthai,int startIndex, int endIndex) throws VaarthaiException {
        if (startIndex < 0) {
            throw new VaarthaiException("Negative indices found");
        }
        if (startIndex >= vaarthai.elutthuCount() || endIndex > vaarthai.elutthuCount()) {
            throw new VaarthaiException("Index out of bound");
        }
        List<String> stringList = new LinkedList<>();
        for (int i = startIndex; i < endIndex; i++) {
            stringList.add(vaarthai.elutthukkal().get(i));
        }
        return new Vaarthai(stringList);
    }

}
