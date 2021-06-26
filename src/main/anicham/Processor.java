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

import java.util.List;


public class Processor {

    static public Processed process(String stringToProcess) {
        TamizhLexer lexer = new TamizhLexer(new ANTLRInputStream(stringToProcess));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TamizhParser parser = new TamizhParser(tokens);
        ParseTree tree = parser.patthi();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
        return new Processed(visitor.getPatthigal());
    }

    static public Vaakiyam vaakiyam(String stringToProcess){
        List<Vaakiyam> vaakiyangal = Processor.process(stringToProcess).vaakiyangal();
        if(vaakiyangal.size()!=1) throw new AnichamExceptions("Not a valid Ezhuththu");
        return vaakiyangal.get(0);
    }

    static public Sol sol(String stringToProcess){
        Sol[] sorkkal = Processor.process(stringToProcess).sorkkal();
        if(sorkkal.length!=1) throw new AnichamExceptions("Not a valid Sol");
        return sorkkal[0];
    }

    static public Ezhuththu ezhuththu(String stringToProcess){
        Ezhuththu[] ezhuththukkal = Processor.process(stringToProcess).ezhuththukkal();
        if(ezhuththukkal.length!=1) throw new AnichamExceptions("Not a valid Ezhuththu");
        return ezhuththukkal[0];
    }
}
