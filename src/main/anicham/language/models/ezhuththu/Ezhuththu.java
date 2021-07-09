package anicham.language.models.ezhuththu;

import grammar.TamizhLexer;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.Objects;

public class Ezhuththu {
    EzhuththuType tokenType;
    String s;
    private static HashMap<String, Ezhuththu> ezhutthuCache = new HashMap<>();

    private Ezhuththu(EzhuththuType tokenType, String s) {
        this.tokenType = tokenType;
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public EzhuththuType getEzhuththuType() {
        return tokenType;
    }

    public static Ezhuththu create(Token token) {
        if (ezhutthuCache.containsKey(token.getText())) return ezhutthuCache.get(token.getText());

        String tokenName = TamizhLexer.VOCABULARY.getSymbolicName(token.getType());
        if (tokenName.startsWith("MEI")) {
            Ezhuththu ezhuththu = new Ezhuththu(EzhuththuType.MEI, token.getText());
            ezhutthuCache.put(token.getText(), ezhuththu);
            return ezhuththu;
        }
        if (tokenName.startsWith("UYIR_MEI")) {
            Ezhuththu ezhuththu = new Ezhuththu(EzhuththuType.UYIR_MEI, token.getText());
            ezhutthuCache.put(token.getText(), ezhuththu);
            return ezhuththu;
        }
        if (tokenName.startsWith("UYIR")) {
            Ezhuththu ezhuththu = new Ezhuththu(EzhuththuType.UYIR, token.getText());
            ezhutthuCache.put(token.getText(), ezhuththu);
            return ezhuththu;
        }
        if (tokenName.equals("AAYTHAM")) {
            Ezhuththu ezhuththu = new Ezhuththu(EzhuththuType.AAYTHAM, token.getText());
            ezhutthuCache.put(token.getText(), ezhuththu);
            return ezhuththu;
        }
        Ezhuththu ezhuththu = new Ezhuththu(EzhuththuType.GRANTHA, token.getText());
        ezhutthuCache.put(token.getText(), ezhuththu);
        return ezhuththu;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ezhuththu ezhuththu = (Ezhuththu) o;
        return tokenType == ezhuththu.tokenType &&
                Objects.equals(s, ezhuththu.s);
    }
}
