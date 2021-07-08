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
        EerasaiSeer seerOne=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.kuril, Oasai.kuril),Asai.getNerAsai(Oasai.kuril));
        EerasaiSeer seerTwo=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.kuril, Oasai.kuril),Asai.getNerAsai(Oasai.kuril));

        assertEquals(seerOne,seerTwo);

        EerasaiSeer seerThree=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.kuril, Oasai.nedil),Asai.getNerAsai(Oasai.kuril));
        EerasaiSeer seerFour=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.kuril, Oasai.kuril),Asai.getNerAsai(Oasai.kuril));

        assertNotEquals(seerThree,seerFour);
    }
}
