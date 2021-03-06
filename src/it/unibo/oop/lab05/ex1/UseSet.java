package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
        Set<String> mySet = new TreeSet<>();

        for (int i = 1; i < 20; i++) {
            mySet.add(Integer.toString(i));
        }
        System.out.println(mySet);

        Iterator<String> iterator = mySet.iterator();

        while (iterator.hasNext()) {
            if (Integer.parseInt(iterator.next()) % 3 == 0)
                iterator.remove();
        }

        for (String x : mySet) {
            System.out.println(x);
        }

        var set2 = new TreeSet<>();
        for (int i = 2; i <= mySet.size(); i += 2) {
            set2.add(Integer.toString(i));
        }
        System.out.println("Even elements: " + set2);
        System.out.println(set2.containsAll(mySet));

    }
}
