package algos.salut_toto;

import java.util.List;
import java.util.concurrent.*;

import static algos.salut_toto.Consts.*;
import static java.util.Arrays.asList;
import static java.util.concurrent.Executors.newFixedThreadPool;

public class SalutToto {

    public String tell(int times) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < times; index++) {
            try {
                result.append(salutToto());
            } catch (InterruptedException | ExecutionException e) {
                throw new ThreadExecutionOcuredProblemException();
            }
        }
        return result.toString().trim();
    }

    private String salutToto() throws InterruptedException, ExecutionException {
        StringBuilder salutToto = new StringBuilder();
        for (Future<String> thread : getThreads()) {
            salutToto.append(thread.get());
            salutToto.append(ESPACE);
        }
        return salutToto.toString();
    }

    private List<Future<String>> getThreads() throws InterruptedException {
        return newFixedThreadPool(2).invokeAll(asList(() -> SALUT, () -> TOTO));
    }
}
