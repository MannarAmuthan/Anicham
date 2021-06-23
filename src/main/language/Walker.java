package language;

import grammar.TamizhBaseListener;
import grammar.TamizhParser;

public class Walker extends TamizhBaseListener {
    @Override
    public void enterWord(TamizhParser.WordContext ctx) {
        System.out.println("Entering "+ctx.UYIR());
        super.enterWord(ctx);
    }

    @Override
    public void exitWord(TamizhParser.WordContext ctx) {
        System.out.println("Exiting "+ctx.UYIR());
        super.exitWord(ctx);
    }
}
