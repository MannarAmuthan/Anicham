import grammar.TamizhLexer;
import grammar.TamizhParser;
import language.Vaakiyam;
import language.Visitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;


public class Processor {

    static Vaakiyam process(String stringToProcess) {
        TamizhLexer lexer = new TamizhLexer(new ANTLRInputStream(stringToProcess));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        List<Token> tokensList = tokens.getTokens();
        TamizhParser parser = new TamizhParser(tokens);
        ParseTree tree = parser.start();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
        return visitor.vaakiyam;
    }
}
