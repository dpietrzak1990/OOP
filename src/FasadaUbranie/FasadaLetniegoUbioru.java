package FasadaUbranie;

import Fasada.FasadaKinaDomowego;

/**
 * Created by RENT on 2017-08-31.
 */
public class FasadaLetniegoUbioru implements IUbranieNaPoreRoku {
    private Sandaly _sandaly;
    private  Skarpetki _skarpetki;

    public FasadaLetniegoUbioru(Sandaly san, Skarpetki skar){
        _sandaly = san;
        _skarpetki = skar;
    }
    @Override
    public void ubierzSie() {
        _skarpetki.ubierzUbranie();
        _sandaly.ubierzUbranie();
    }
    @Override
    public void rozbierzSie() {
        _sandaly.rozbierzUbranie();
        _skarpetki.rozbierzUbranie();
    }
}
