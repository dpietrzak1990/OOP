package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public abstract class Kaczka {
    protected IKwakanie kwakanie;
    protected ILatanie latanie;


    public void Plywaj(){
        System.out.println("Pływu pływu!");
    }
    public void Wyswietl(){
        System.out.println("Wyświetlam kaczkę!");
    }
    public void wykonajLatanie(){
        latanie.Lec();
    }
    public void wykonajKwakanie(){
        kwakanie.Kwacz();
    }
    public void setKwakanie(IKwakanie kwakanie){
        this.kwakanie = kwakanie;
    }
    public void setLatanie(ILatanie latanie){
        this.latanie = latanie;
    }
}
