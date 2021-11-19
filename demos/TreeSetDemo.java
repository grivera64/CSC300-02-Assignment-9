//package assignment9.demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        /* Local Variables */
        Random randy;
        List<Integer> numAL;
        Set<Integer> numTS;
        Iterator<Integer> alIter;

        randy = new Random(5);
        numAL = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            numAL.add(randy.nextInt(7));

        }

        System.out.printf("ArrayList: %s\n", numAL);

        numTS = new TreeSet<>();

        alIter = numAL.iterator();
        while (alIter.hasNext()) {

            numTS.add(alIter.next());

        }
        System.out.printf("TreeSet: %s\n", numTS);

    }

}
