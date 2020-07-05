package algos.salut_toto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.assertThat;

public class SalutTotoShould {

    @Test
    void write_Salut_Toto_3_times() throws ExecutionException, InterruptedException {
        SalutToto st = new SalutToto();
        Assertions.assertThat(st.tell()).isEqualTo("Salut Toto");
    }
}
