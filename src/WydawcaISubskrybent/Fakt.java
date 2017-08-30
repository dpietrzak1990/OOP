package WydawcaISubskrybent;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-30.
 */
public class Fakt implements IWydawca {
    private ArrayList<IOdbiorca> _odbiorcy;
    private String _numer;

    public Fakt(){
        _odbiorcy = new ArrayList<>();
    }
    @Override
    public void dadajPrenumeratora(IOdbiorca prenumerator) {
        _odbiorcy.add(prenumerator);
    }
    @Override
    public void usunPrenumeratora(IOdbiorca prenumerator) {
        _odbiorcy.remove(prenumerator);
    }
    @Override
    public void wyslijNowyNumer() {
        for (IOdbiorca odbiorca : _odbiorcy) {
            odbiorca.odbierzGazete(_numer);
        }
    }
    public void wydajNumer(String numer){
        _numer = numer;
        wyslijNowyNumer();
    }
}
