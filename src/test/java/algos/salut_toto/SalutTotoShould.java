package algos.salut_toto;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.assertThat;

public class SalutTotoShould {

    @Test
    void write_Salut_Toto_3_times() throws ExecutionException, InterruptedException {
        assertThat(new SalutToto().tell(3)).isEqualTo("Salut Toto Salut Toto Salut Toto");
    }

}
