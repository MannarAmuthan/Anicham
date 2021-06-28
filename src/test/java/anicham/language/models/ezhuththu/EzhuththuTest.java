package anicham.language.models.ezhuththu;

import anicham.Anicham;
import anicham.language.models.sol.Sol;
import org.junit.Test;

public class EzhuththuTest {
    @Test
    public void shouldUseEzhuththuFromCache() {
        Ezhuththu ezhuththu= Anicham.ezhuththu("ட்");
        Sol sol= Anicham.sol("உத்திரட்டாதி");

        assert sol.ezhutthukkal().get(4) == ezhuththu;
    }
}
