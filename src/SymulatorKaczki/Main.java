package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        GumowaKaczka gk = new GumowaKaczka();
        gk.wykonajKwakanie();
        gk.wykonajLatanie();
        DzikaKaczka dk = new DzikaKaczka();
        dk.wykonajLatanie();
        dk.wykonajKwakanie();
        PlaskonosKaczka pk = new PlaskonosKaczka();
        pk.wykonajKwakanie();
        pk.wykonajLatanie();

        KaczkaModel km = new KaczkaModel();
        km.Wyswietl();
        km.wykonajLatanie();
        km.setLatanie(new LotZNapedemRakietowym());
        km.wykonajKwakanie();

    }


}
