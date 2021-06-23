import grammar.TamizhLexer;
import grammar.TamizhParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import language.Walker;

public class Processor {
    static void process(String stringToProcess){
        TamizhLexer lexer = new TamizhLexer( new ANTLRInputStream(stringToProcess));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        TamizhParser parser = new TamizhParser( tokens );
        ParseTree tree = parser.word();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new Walker(), tree );
    }

    public static void main(String[] args) {
        Processor.process("\u0B8E");
    }
}
