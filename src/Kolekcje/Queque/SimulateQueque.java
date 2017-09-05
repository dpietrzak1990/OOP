package Kolekcje.Queque;

import java.util.ArrayDeque;

/**
 * Created by RENT on 2017-09-05.
 */
public class SimulateQueque {
    public static void main(String[] args) {
        ArrayDeque<Person> queque = new ArrayDeque<>();
        queque.add(new Person("Mariola", "piwo, wino, cola"));
        queque.add(new Person("Andżej", "paczka szlugów"));
        queque.add(new Person("Kuba", "materac"));
        queque.add(new Person("Mariola", "godność osobistą"));

        while (!queque.isEmpty()){
            Person currentClient = queque.removeFirst();
            System.out.println(currentClient.getName());
            System.out.println(currentClient.UnpackShopping());
        }
        System.out.println("Obsłużyliśmy klientow");
    }
}
