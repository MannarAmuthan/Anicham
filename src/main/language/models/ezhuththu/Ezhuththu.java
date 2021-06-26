package language.models.ezhuththu;

import grammar.TamizhLexer;
import org.antlr.v4.runtime.Token;

import java.util.Objects;

public class Ezhuththu {
    EzhuththuEnum tokenType;
    String s;

    private Ezhuththu(EzhuththuEnum tokenType, String s) {
        this.tokenType = tokenType;
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public static Ezhuththu create(Token token) {
        String tokenName = TamizhLexer.VOCABULARY.getSymbolicName(token.getType());
        if (tokenName.startsWith("MEI")) {
            return new Ezhuththu(EzhuththuEnum.MEI, token.getText());
        }
        if (tokenName.endsWith("UYIR_MEI")) {
            return new Ezhuththu(EzhuththuEnum.UYIR_MEI, token.getText());
        }
        if (tokenName.startsWith("UYIR")) {
            return new Ezhuththu(EzhuththuEnum.UYIR, token.getText());
        }
        if (tokenName.equals("AAYTHAM")) {
            return new Ezhuththu(EzhuththuEnum.AAYTHAM, token.getText());
        }
        return new Ezhuththu(EzhuththuEnum.SRI, token.getText());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ezhuththu ezhuththu = (Ezhuththu) o;
        return tokenType == ezhuththu.tokenType &&
                Objects.equals(s, ezhuththu.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenType, s);
    }
}
