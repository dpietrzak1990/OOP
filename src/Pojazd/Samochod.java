package Pojazd;

/**
 * Created by RENT on 2017-08-23.
 */
public class Samochod implements ICzteroKolowy {

    @Override
    public void jedz() {
        System.out.printf("Jadę!\n");
    }
    @Override
    public void hamuj() {
        System.out.printf("Hamuję!\n");
    }
    @Override
    public void jedzNaCzolowke() {
        System.out.printf("Jadę na czołówkę!\n ");
    }
}
