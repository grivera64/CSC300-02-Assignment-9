//package assignment9.demos;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Set<String> lhCountries = new LinkedHashSet<>();
        lhCountries.add("India");
        lhCountries.add("Australia");
        lhCountries.add("South Africa");
        lhCountries.add("India");                                   // Duplicate Entry Test

        System.out.printf("%s\n", lhCountries);
        lhCountries.remove("Australia");
        System.out.printf("Set after removing Australia: %s\n", lhCountries);

        System.out.println("Iterating over set:");
        Iterator<String> iterCountries = lhCountries.iterator();
        while (iterCountries.hasNext()) {

            System.out.printf("%s\n", iterCountries.next());

        }

    }

}
