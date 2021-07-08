package anicham; /**
 * @author Amuthan Mannan
 */

import anicham.ilakkanam.models.Adi;
import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.models.Oasai;
import anicham.ilakkanam.models.Venba;
import anicham.ilakkanam.models.seer.Seer;
import anicham.ilakkanam.visitors.*;
import anicham.language.models.Patthi;
import anicham.language.models.Vaakiyam;
import anicham.language.models.ezhuththu.Ezhuththu;
import anicham.language.models.sol.Sol;
import anicham.language.visitors.EzhuththuVisitor;
import anicham.language.visitors.SolVisitor;
import anicham.language.visitors.VaakiyamVisitor;
import anicham.language.visitors.Visitor;
import grammar.TamizhLexer;
import grammar.TamizhParser;
import grammar.Yaappu.VenbaLexer;
import grammar.Yaappu.VenbaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;


public class Anicham {
    /*Parsers*/

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


    /*Grammar*/

    public static Venba venba(String stringToProcess){
        VenbaParser parser = getVenbaParser(stringToProcess);
        ParseTree tree = parser.venpa();
        VenbaVisitor visitor=new VenbaVisitor();
        return visitor.visit(tree);
    }

    public static Seer seer(String stringToProcess){
        VenbaParser parser = getVenbaParser(stringToProcess);
        ParseTree tree = parser.seer();
        SeerVisitor visitor=new SeerVisitor();
        return visitor.visit(tree);
    }

    public static Asai asai(String stringToProcess){
        AsaiVisitor visitor=new AsaiVisitor();
        Asai visitNirai = visitor.visit(getVenbaParser(stringToProcess).nirai_asai());
        if(visitNirai!=null){
            return visitNirai;
        }
        return visitor.visit(getVenbaParser(stringToProcess).ner_asai());
    }

    public static Adi adi(String stringToProcess){
        AdiVisitor visitor=new AdiVisitor();
        try {
            return visitor.visit(getVenbaParser(stringToProcess).adi());
        }
        catch (NullPointerException e){
            return visitor.visit(getVenbaParser(stringToProcess).eetradi());
        }
    }

    public static Oasai oasai(String stringToProcess){
        OasaiVisitor visitor=new OasaiVisitor();
        Oasai visitedKuril = visitor.visit(getVenbaParser(stringToProcess).kuril());
        if(visitedKuril!=null) return visitedKuril;

        Oasai visitedNedil = visitor.visit(getVenbaParser(stringToProcess).nedil());
        if(visitedNedil!=null) return visitedNedil;

        return  visitor.visit(getVenbaParser(stringToProcess).otru());
    }

    /*Language*/

    static public Processed processTamizhString(String stringToProcess) {
        TamizhParser parser = getTamizhParser(stringToProcess);
        ParseTree tree = parser.tamizh_script();
        Visitor visitor = new Visitor();
        List<Patthi> patthigal = visitor.visit(tree);
        return new Processed(patthigal);
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
