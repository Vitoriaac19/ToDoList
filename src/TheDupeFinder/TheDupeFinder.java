package TheDupeFinder;

import java.util.*;

public class TheDupeFinder<E extends Comparable<E>> {
    private List<E> fruits;
    //criar uma lista para armazenar os dupes

    public TheDupeFinder(List<E> fruits, E fruit) {
        this.fruits = new ArrayList<>(fruits);
        this.fruits.add(fruit);
    }


    public List<E> getDupes() {
        Set<E> setFruitsTemp = new HashSet<>();                     //criar um set temporario do tipo hashset
        List<E> dupes = new ArrayList<>();

        for (E fruit : fruits) {                      //para fruta em frutas
            if (!setFruitsTemp.add(fruit)) {          //se não puder ser adicionada ao set, é pq é duplicada
                dupes.add(fruit);                   //vai para a lista
            }
        }
        return dupes;
    }

    public int checkDupes() {
        return getDupes().size();
    }

    public List<E> sortedDupes() {
        List<E> duplicate = getDupes();

        duplicate.sort(Comparator.reverseOrder());

        return duplicate;

    }
}
