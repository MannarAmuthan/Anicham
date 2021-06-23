package language;

import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;

public class Visitor extends TamizhBaseVisitor {
    @Override
    public Object visitWord(TamizhParser.WordContext ctx) {
        System.out.println("Visiting word: "+ctx.UYIR().getText());
        return super.visitWord(ctx);
    }
}
