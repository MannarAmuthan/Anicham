package anicham; /**
 * @author Amuthan Mannan
 */

import anicham.exceptions.AnichamExceptions;
import anicham.language.models.Vaakiyam;
import anicham.language.models.ezhuththu.Ezhuththu;
import anicham.language.models.sol.Sol;
import grammar.TamizhLexer;
import grammar.TamizhParser;
import anicham.language.Visitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Processor {

    private static TamizhParser getTamizhParser(String stringToProcess) {
        TamizhLexer lexer = new TamizhLexer(new ANTLRInputStream(stringToProcess));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TamizhParser parser = new TamizhParser(tokens);
        return parser;
    }

    private static Processed getProcessed(ParseTree tree) {
        Visitor visitor = new Visitor();
        visitor.visit(tree);
        return new Processed(visitor.getPatthigal());
    }

    static public Processed process(String stringToProcess) {
        TamizhParser parser = getTamizhParser(stringToProcess);
        ParseTree tree = parser.tamizh_script();
        return getProcessed(tree);
    }

    static public Vaakiyam vaakiyam(String stringToProcess) {
        Vaakiyam[] vaakiyangal = Processor.process(stringToProcess).vaakiyangal();
        if (vaakiyangal.length != 1) throw new AnichamExceptions("Not a valid Ezhuththu");
        return vaakiyangal[0];
    }

    static public Sol sol(String stringToProcess) {
        Sol[] sorkkal = Processor.process(stringToProcess).sorkkal();
        if (sorkkal.length != 1) throw new AnichamExceptions("Not a valid Sol");
        return sorkkal[0];
    }

    static public Ezhuththu ezhuththu(String stringToProcess) {
        Ezhuththu[] ezhuththukkal = Processor.process(stringToProcess).ezhuththukkal();
        if (ezhuththukkal.length != 1) throw new AnichamExceptions("Not a valid Ezhuththu");
        return ezhuththukkal[0];
    }
}
