package algos.salut_toto;

import org.junit.jupiter.api.Test;

import static algos.salut_toto.Consts.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SalutTotoShould {

    @Test
    void write_Salut_Toto_3_times() {
        assertThat(new SalutToto().tell(3))
                .isEqualTo(
                        SALUT + ESPACE + TOTO + ESPACE +
                        SALUT + ESPACE + TOTO + ESPACE +
                        SALUT + ESPACE + TOTO);
    }

}
