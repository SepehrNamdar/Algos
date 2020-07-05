package algos.salut_toto;

import java.util.List;
import java.util.concurrent.*;

import static java.util.Arrays.asList;
import static java.util.concurrent.Executors.newFixedThreadPool;

public class SalutToto {

    private static final String SALUT = "Salut";
    private static final String TOTO = "Toto";

    public String tell() throws InterruptedException, ExecutionException {
        StringBuilder salutToto = new StringBuilder();
        for (Future<String> future : getThreads()) {
            salutToto.append(future.get());
            salutToto.append(" ");
        }
        return salutToto.toString().trim();
    }

    private List<Future<String>> getThreads() throws InterruptedException {
        return newFixedThreadPool(2).invokeAll(asList(() -> SALUT, () -> TOTO));
    }
}
