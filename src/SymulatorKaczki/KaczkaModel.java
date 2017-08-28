package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaModel extends Kaczka {
    public KaczkaModel(){
        latanie = new LatamBoMamSkrzydla();
        kwakanie = new NieKwacz();
    }
    @Override
    public void Wyswietl(){
        System.out.println("Jestem Kaczka Model :)");
    }
}
