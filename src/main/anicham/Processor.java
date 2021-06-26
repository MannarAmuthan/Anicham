package anicham; /**
 * @author Amuthan Mannan
 */

import grammar.TamizhLexer;
import grammar.TamizhParser;
import anicham.language.Visitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



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
}
