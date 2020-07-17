package algos;

import java.util.*;

public class Singleton {
    private final List<Integer> liste;

    public Singleton(List<Integer> liste) {
        this.liste = liste;
    }

    public Set<Integer> getSingleton() {
/*        if(liste.isEmpty()) {
            return 0;
        }
        Integer integer = liste.get(0);
        return integer;*/

        Set<Integer> set = new HashSet<>();

        liste.forEach(e -> {
            if(set.contains(e)) {
                set.remove(e);
            } else {
                set.add(e);
            }
        });

        return set;
    }

    //[1,2,3,4,1,2,3] = Somme(Set<[1,2,3,4,1,2,3]>) * 2 - Singleton
    //[1,2,3,4] = 10
}
