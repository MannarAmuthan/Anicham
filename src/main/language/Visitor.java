package language;

import grammar.TamizhBaseVisitor;
import grammar.TamizhParser;

public class Visitor extends TamizhBaseVisitor {
    @Override
    public Object visitSentence(TamizhParser.SentenceContext ctx) {
        return super.visitSentence(ctx);
    }

    @Override
    public Object visitWord(TamizhParser.WordContext ctx) {
        return super.visitWord(ctx);
    }
}
