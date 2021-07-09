package e2e;

import anicham.Anicham;
import anicham.language.models.Patthi;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AnichamTest {
    @Test
    public void shouldParseTamizh() throws IOException {

            String content = Files.readString(Path.of("src/test/resources/testTamizh.txt"), StandardCharsets.UTF_8);


            List<Patthi> patthigal = Anicham.patthigal(content);


            assert  patthigal.size() == 3;


            assert patthigal.get(0).getVaakiyangal().size() == 4;
            assert patthigal.get(1).getVaakiyangal().size() == 2;
            assert patthigal.get(2).getVaakiyangal().size() == 3;

            assert patthigal.get(0).getVaakiyangal().get(0).sorkkalCount() == 5;
            assert patthigal.get(0).getVaakiyangal().get(1).sorkkalCount() == 5;
            assert patthigal.get(0).getVaakiyangal().get(2).sorkkalCount() == 8;
            assert patthigal.get(0).getVaakiyangal().get(3).sorkkalCount() == 8;


            assert patthigal.get(1).getVaakiyangal().get(0).sorkkalCount() == 11;
            assert patthigal.get(1).getVaakiyangal().get(1).sorkkalCount() == 14;

            assert patthigal.get(2).getVaakiyangal().get(0).sorkkalCount() == 7;
            assert patthigal.get(2).getVaakiyangal().get(1).sorkkalCount() == 19;
            assert patthigal.get(2).getVaakiyangal().get(2).sorkkalCount() == 6;


    }
}
