package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class PlaskonosKaczka extends Kaczka {

    public PlaskonosKaczka(){
        latanie = new LatamBoMamSkrzydla();
        kwakanie = new Kwacz();
    }
    @Override
    public void Wyswietl(){
        System.out.println("Wyświetlam płaskonosa");
    }

}
