package Pojazd;

/**
 * Created by RENT on 2017-08-23.
 */
public class Motocykl implements IDwuKolowy {

    @Override
    public void jedz() {
        System.out.printf("Jadę!\n");
    }
    @Override
    public void hamuj() {
        System.out.printf("Hamuję!\n");
    }
    @Override
    public void przewrocSie() {
        System.out.printf("Prazewróciłem się!\n");
    }
    public void dodajGazu(){
        System.out.printf("Dodaję gazu!\n");
    }
}
