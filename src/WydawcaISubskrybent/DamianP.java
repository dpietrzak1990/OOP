package WydawcaISubskrybent;

/**
 * Created by RENT on 2017-08-30.
 */
public class DamianP implements IOdbiorca {

    private IWydawca _gazeta;

    public DamianP(IWydawca gazeta){
       zaprenumerujGazete(gazeta);
    }

    @Override
    public void odbierzGazete(String numer) {
        System.out.printf("Hurrra! Jest już nowy numer %s gazety!\n", numer);
    }

    public void rezygnujZGazety(){
        _gazeta.usunPrenumeratora(this);
    }
    public void zaprenumerujGazete(IWydawca gazeta){
        _gazeta = gazeta;
        gazeta.dadajPrenumeratora(this);
    }
}
