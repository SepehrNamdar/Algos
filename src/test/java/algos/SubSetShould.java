package algos;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SubSetShould {

    @Test
    @Disabled
    void givenAnEmptyListReturnEmptyList() {
        List<Integer> liste = new ArrayList<>();
        SubSet ss = new SubSet(liste);

        assertThat(ss.getSubSet()).isEqualTo(new ArrayList<>());
    }

    @Test
    void givenAListWithOneElementReturnSubSetOfElements() {
        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        SubSet ss = new SubSet(liste);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        ArrayList<Integer> e = new ArrayList<>();
        e.add(1);
        result.add(e);

        assertThat(ss.getSubSet()).isEqualTo(result);
    }

    @Test
    void givenAListWithTwoElementsReturnSubSetOfElements() {
        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        SubSet ss = new SubSet(liste);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        ArrayList<Integer> e = new ArrayList<>();
        e.add(1);
        e.add(2);

        result.add(e);
    }
}
