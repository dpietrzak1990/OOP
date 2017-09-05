package Kolekcje;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by RENT on 2017-09-05.
 */
public class Hash {
    public static void main(String[] args) {
        TreeSet<String> zbior = new TreeSet<>();
        zbior.add("Nowak");
        zbior.add("Pietrzak");
        zbior.add("Kowalski");
        zbior.add("Maly");
        zbior.add("Nowacki");
        zbior.add("Szymura");
        zbior.add("Nowaczek");

        for (String s : zbior) {
//            System.out.println(s);
        }
        HashSet<Integer> intere = new HashSet<>();
        intere.add(1);
        intere.add(2);
        intere.add(3);
        HashSet<Integer> integerss = new HashSet<>();
        integerss.add(3);
        integerss.add(4);

        intere.retainAll(integerss);

        for (Integer s : intere) {
            System.out.println(s);

        TreeSet<Integer> ts = new TreeSet<>();
            ts.add(1);
            ts.add(6);
            ts.add(7);
            Integer zzz = ts.ceiling(5);
            System.out.println(zzz);

        }


    }
}
