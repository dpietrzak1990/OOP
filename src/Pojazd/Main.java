package Pojazd;

/**
 * Created by RENT on 2017-08-23.
 */
public class Main {
    public static void main(String[] args) {
        ICzteroKolowy samochod1 = new Samochod();
        samochod1.jedzNaCzolowke();

        Motocykl motocykl = new Motocykl();
        motocykl.dodajGazu();

    }
}
