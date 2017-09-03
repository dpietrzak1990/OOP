package FasadaUbranie;

import Fasada.FasadaKinaDomowego;

/**
 * Created by RENT on 2017-08-31.
 */
public class FasadaLetniegoUbioru implements IUbranieNaPoreRoku {
    private Bokserki _bokserki;
    private Shorty _shorty;
    private Tshirt _tshirt;
    private Skarpetki _skarpetki;
    private Sandaly _sandaly;
    private CzapkaZDaszkiem _czapka;


    public FasadaLetniegoUbioru(Bokserki boks, Shorty shr, Tshirt tsh, Skarpetki skar, Sandaly san, CzapkaZDaszkiem czap){
        _bokserki = boks;
        _shorty = shr;
        _tshirt = tsh;
        _skarpetki = skar;
        _sandaly = san;
        _czapka = czap;
    }
    @Override
    public void ubierzSie() {
        _bokserki.ubierzUbranie();
        _shorty.ubierzUbranie();
        _tshirt.ubierzUbranie();
        _skarpetki.ubierzUbranie();
        _sandaly.ubierzUbranie();
        _czapka.ubierzUbranie();
    }
    @Override
    public void rozbierzSie() {
        _sandaly.rozbierzUbranie();
        _czapka.rozbierzUbranie();
        _tshirt.rozbierzUbranie();
        _shorty.rozbierzUbranie();
        _skarpetki.rozbierzUbranie();
        _bokserki.rozbierzUbranie();
    }
}
