package anicham; /**
 * @author Amuthan Mannan
 */

import anicham.ilakkanam.VenbaVisitor;
import anicham.ilakkanam.models.Venba;
import anicham.language.models.Patthi;
import anicham.language.models.Vaakiyam;
import anicham.language.models.ezhuththu.Ezhuththu;
import anicham.language.models.sol.Sol;
import anicham.language.visitors.*;
import grammar.TamizhLexer;
import grammar.TamizhParser;
import grammar.Yaappu.VenbaLexer;
import grammar.Yaappu.VenbaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;


public class Anicham {

    private static TamizhParser getTamizhParser(String stringToProcess) {
        TamizhLexer lexer = new TamizhLexer(new ANTLRInputStream(stringToProcess));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new TamizhParser(tokens);
    }

    private static VenbaParser getVenbaParser(String stringToProcess) {
        VenbaLexer lexer = new VenbaLexer(new ANTLRInputStream(stringToProcess));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new VenbaParser(tokens);
    }

    public static Venba venba(String stringToProcess){
        VenbaParser parser = getVenbaParser(stringToProcess);
        ParseTree tree = parser.venpa();
        VenbaVisitor visitor=new VenbaVisitor();
        return (Venba) visitor.visit(tree);
    }

    private static Processed getProcessed(ParseTree tree) {
        Visitor visitor = new Visitor();
        List<Patthi> patthigal = visitor.visit(tree);
        return new Processed(patthigal);
    }

    static public Processed process(String stringToProcess) {
        TamizhParser parser = getTamizhParser(stringToProcess);
        ParseTree tree = parser.tamizh_script();
        return getProcessed(tree);
    }

    static public List<Patthi> patthigal(String stringToProcess) {
        TamizhParser parser = getTamizhParser(stringToProcess);
        ParseTree tree = parser.tamizh_script();
        Visitor visitor=new Visitor();
        return visitor.visit(tree);
    }

    static public Vaakiyam vaakiyam(String stringToProcess) {
        TamizhParser parser = getTamizhParser(stringToProcess);
        ParseTree tree = parser.vaakiyam();
        VaakiyamVisitor vaakiyamVisitor=new VaakiyamVisitor();
        return vaakiyamVisitor.visit(tree);
    }

    static public Sol sol(String stringToProcess) {
        TamizhParser parser = getTamizhParser(stringToProcess);
        ParseTree tree = parser.sol();
        SolVisitor solVisitor=new SolVisitor();
        return solVisitor.visit(tree);
    }

    static public Ezhuththu ezhuththu(String stringToProcess) {
        TamizhParser parser = getTamizhParser(stringToProcess);
        ParseTree tree = parser.ezhuththu();
        EzhuththuVisitor ezhuththuVisitor=new EzhuththuVisitor();
        return ezhuththuVisitor.visit(tree);
    }
}
