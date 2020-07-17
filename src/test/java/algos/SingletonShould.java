package algos;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonShould {

    @Test
    @Disabled
    void getNothingWhenListIsEmpty() {
        List<Integer> liste = new ArrayList<>();
        Singleton s = new Singleton(liste);

        assertThat(s.getSingleton()).isEqualTo(0);
    }

    @Test
    @Disabled
    void getTheElementWhenListHasOneElement() {
        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        Singleton s = new Singleton(liste);

        assertThat(s.getSingleton()).isEqualTo(2);
    }

    @Test
    void getNothingIfNotSingletonElement() {
        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(2);
        Singleton s = new Singleton(liste);

        Map<Integer, Integer> result = new HashMap<>();

        assertThat(s.getSingleton()).isEqualTo(result);
    }

    @Test
    void getTheSingletonElement() {
        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(1);
        liste.add(2);
        liste.add(3);
        Singleton s = new Singleton(liste);

        Set<Integer> result = new HashSet<>();
        result.add(4);

        assertThat(s.getSingleton()).isEqualTo(result);
    }
}
