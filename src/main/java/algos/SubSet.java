package algos;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    private List<Integer> liste;

    public SubSet(List<Integer> liste) {
        this.liste = liste;
    }

    public List<List<Integer>> getSubSet() {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        List<Integer> l = new ArrayList<>();
        liste.forEach(e -> {
            l.add(e);
            lists.add(l);
        });
        return lists;
    }
}
