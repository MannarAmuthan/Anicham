package anicham.ilakkanam;

import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.models.Oasai;
import anicham.ilakkanam.models.seer.EerasaiSeer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SeerTest {

    @Test
    public void shouldEquateTwoSeergal() {
        EerasaiSeer seerOne=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL),Asai.getNerAsai(Oasai.KURIL));
        EerasaiSeer seerTwo=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL),Asai.getNerAsai(Oasai.KURIL));

        assertEquals(seerOne,seerTwo);

        EerasaiSeer seerThree=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.KURIL, Oasai.NEDIL),Asai.getNerAsai(Oasai.KURIL));
        EerasaiSeer seerFour=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL),Asai.getNerAsai(Oasai.KURIL));

        assertNotEquals(seerThree,seerFour);
    }
}
