package anicham.language.sol;

import anicham.Anicham;
import anicham.language.exceptions.SolException;
import anicham.language.models.ezhuththu.Ezhuththu;
import anicham.language.models.ezhuththu.EzhuththuType;
import anicham.language.models.sol.Sol;
import anicham.language.models.sol.Sorkkal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SorkkalTest {

    @Test
    public void shouldGetSubstring(){
        Sol v1 = Anicham.sol("புதுமைப்பித்தன்");
        Sol expected= Anicham.sol("பித்தன்");

        Sol actual = Sorkkal.substring(v1,4, 8);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldThrowExceptionForIndexErrors() {
        Sol v1 = Anicham.sol("புதுமைப்பித்தன்");

        try {
            Sorkkal.substring(v1,4, 9);
            fail();
        } catch (SolException solException) {
            assertEquals("Index out of bound",solException.getMessage());
        }

        try {
            Sorkkal.substring(v1,-1, 2);
            fail();
        } catch (SolException solException) {
            assertEquals("Negative indices found",solException.getMessage());
        }
    }

    @Test
    public void shouldReverseTheGivenSol() {
        Sol v1 = Anicham.sol("ஶ்ரீரங்கம்");
        Sol expected= Anicham.sol("ம்கங்ரஶ்ரீ");

        Sol actual = Sorkkal.reverse(v1);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldRemoveTheElutthuFromSol(){
        Sol v1 = Anicham.sol("ஶ்ரீரங்கம்");
        Sol expected= Anicham.sol("ஶ்ரீரங்க");

        Sol actual = Sorkkal.remove(v1,4);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldGetEzhuththuForGivenPosition() {
        Sol v1 = Anicham.sol("புதுமைப்பித்தன்");

        Ezhuththu ezhuththu = Sorkkal.ezhuththuAt(v1, 2);

        assert ezhuththu != null;
        assertEquals("மை",ezhuththu.toString());
    }

    @Test
    public void shouldGetCountOfEzhuththuOfGivenTypeInGivenSol() {
        Sol sol= Anicham.sol("உத்திரட்டாதி");
        Sol sol2= Anicham.sol("கஃறீது");
        Sol sol3= Anicham.sol("ஷஹாபுதீன்");

        long actualUyirCount=Sorkkal.countTypeOf(sol, EzhuththuType.UYIR);
        long actualMeiCount=Sorkkal.countTypeOf(sol, EzhuththuType.MEI);
        long actualUyirMeiCount=Sorkkal.countTypeOf(sol, EzhuththuType.UYIR_MEI);
        long actualAythamCount= Sorkkal.countTypeOf(sol2,EzhuththuType.AAYTHAM);
        long actualGranthaCount= Sorkkal.countTypeOf(sol3,EzhuththuType.GRANTHA);

        assertEquals(1,actualUyirCount);
        assertEquals(2,actualMeiCount);
        assertEquals(4,actualUyirMeiCount);
        assertEquals(1,actualAythamCount);
        assertEquals(2,actualGranthaCount);
    }
}
