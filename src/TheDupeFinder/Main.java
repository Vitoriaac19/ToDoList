package TheDupeFinder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TheDupeFinder<Fruit> dupefinder = new TheDupeFinder<>(Arrays.asList(new Fruit("orange", 2),
                new Fruit("banana", 7), new Fruit("banana", 7),
                new Fruit("apple", 10), new Fruit("apple", 10),
                new Fruit("orange", 2)),
                new Fruit("pear", 4));

        System.out.println(dupefinder.getDupes());
        System.out.println(dupefinder.checkDupes());
        System.out.println(dupefinder.sortedDupes());

    }


}
