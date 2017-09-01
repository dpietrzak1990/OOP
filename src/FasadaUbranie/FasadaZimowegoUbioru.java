package FasadaUbranie;

public class FasadaZimowegoUbioru implements IUbranieNaPoreRoku {
    private Bokserki _bokserki;
    private Jeansy  _jeansy;
    private Tshirt _tshirt;
    private Skarpetki _skarpetki;
    private Trapery _trapery;
    private Bluza _bluza;
    private Kurtka _kurtka;
    private Czapka _czapka;
    private Szalik _szalik;
    private Rekawiczki _rekawiczki;

    public FasadaZimowegoUbioru(Bokserki boks, Jeansy jean, Tshirt ts, Skarpetki skar, Trapery trap,
                                Bluza blu, Kurtka kur, Czapka czap, Szalik szal, Rekawiczki rek){
        _bokserki = boks;
        _jeansy = jean;
        _tshirt = ts;
        _skarpetki = skar;
        _trapery = trap;
        _bluza = blu;
        _kurtka = kur;
        _czapka = czap;
        _szalik = szal;
        _rekawiczki = rek;
    }

    @Override
    public void ubierzSie() {
        _bokserki.ubierzUbranie();
        _jeansy.ubierzUbranie();
        _tshirt.ubierzUbranie();
        _skarpetki.ubierzUbranie();
        _trapery.ubierzUbranie();
        _bluza.ubierzUbranie();
        _kurtka.ubierzUbranie();
        _czapka.ubierzUbranie();
        _szalik.ubierzUbranie();
        _rekawiczki.ubierzUbranie();
    }
    @Override
    public void rozbierzSie() {
        _rekawiczki.rozbierzUbranie();
        _szalik.rozbierzUbranie();
        _czapka.rozbierzUbranie();
        _kurtka.rozbierzUbranie();
        _trapery.rozbierzUbranie();
        _bluza.rozbierzUbranie();
        _skarpetki.rozbierzUbranie();
        _jeansy.rozbierzUbranie();
        _tshirt.rozbierzUbranie();
        _bokserki.rozbierzUbranie();
    }
}
