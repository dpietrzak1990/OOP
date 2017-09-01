package FasadaUbranie;

public class FasandaJesiennegoUbioru implements IUbranieNaPoreRoku {
    private Jeansy  _jeansy;
    private Tshirt _tshirt;
    private Skarpetki _skarpetki;
    private Adidasy _adidasy;
    private Bluza _bluza;

    public FasandaJesiennegoUbioru(Jeansy jeansy, Tshirt tshirt, Skarpetki skarpetki,
                                   Adidasy adidasy, Bluza bluza){
        _jeansy = jeansy;
        _tshirt = tshirt;
        _skarpetki = skarpetki;
        _adidasy = adidasy;
        _bluza = bluza;
    }
    @Override
    public void ubierzSie() {
        _jeansy.ubierzUbranie();
        _tshirt.ubierzUbranie();
        _skarpetki.ubierzUbranie();
        _bluza.ubierzUbranie();
        _adidasy.ubierzUbranie();
    }
    @Override
    public void rozbierzSie() {
        _adidasy.rozbierzUbranie();
        _bluza.rozbierzUbranie();
        _tshirt.rozbierzUbranie();
        _skarpetki.rozbierzUbranie();
        _jeansy.rozbierzUbranie();
    }
}
