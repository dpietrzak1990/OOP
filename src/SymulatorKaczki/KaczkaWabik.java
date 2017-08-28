package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class KaczkaWabik extends Kaczka {
   public KaczkaWabik(){
       latanie = new NieLatam();
       kwakanie = new NieKwacz();
   }
    public void Wyswietl(){
        System.out.println("Wyswietlam Kaczkę wabik.");
    }
}
