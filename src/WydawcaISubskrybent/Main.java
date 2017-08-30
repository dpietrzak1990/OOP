package WydawcaISubskrybent;

/**
 * Created by RENT on 2017-08-30.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        KaczorDonald kd = new KaczorDonald();
        Fakt fakt = new Fakt();

        DamianP dp = new DamianP(kd);

        kd.wydajNumer("KD: 1/2017");
        Thread.sleep(4000);
        kd.wydajNumer("KD: 2/2017");
        Thread.sleep(4000);

        dp.rezygnujZGazety();
        System.out.println("DP DP DP");
        kd.wydajNumer("KD: 3/2017");


    }
}
