package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class GumowaKaczka extends Kaczka {
    public GumowaKaczka(){
        latanie = new NieLatam();
        kwakanie = new Piszczenie();
    }

    @Override
    public void Wyswietl(){
        System.out.println("Wyświetlam Gumową Kaczkę!");
    }
}
