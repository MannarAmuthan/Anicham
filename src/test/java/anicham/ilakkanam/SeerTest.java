package anicham.ilakkanam;

import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.models.Ozhi;
import anicham.ilakkanam.models.seer.EerasaiSeer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SeerTest {

    @Test
    public void shouldEquateTwoSeergal() {
        EerasaiSeer seerOne=EerasaiSeer.getPulima(Asai.getNiraiAsai(Ozhi.kuril,Ozhi.kuril),Asai.getNerAsai(Ozhi.kuril));
        EerasaiSeer seerTwo=EerasaiSeer.getPulima(Asai.getNiraiAsai(Ozhi.kuril,Ozhi.kuril),Asai.getNerAsai(Ozhi.kuril));

        assertEquals(seerOne,seerTwo);

        EerasaiSeer seerThree=EerasaiSeer.getPulima(Asai.getNiraiAsai(Ozhi.kuril,Ozhi.nedil),Asai.getNerAsai(Ozhi.kuril));
        EerasaiSeer seerFour=EerasaiSeer.getPulima(Asai.getNiraiAsai(Ozhi.kuril,Ozhi.kuril),Asai.getNerAsai(Ozhi.kuril));

        assertNotEquals(seerThree,seerFour);
    }
}
