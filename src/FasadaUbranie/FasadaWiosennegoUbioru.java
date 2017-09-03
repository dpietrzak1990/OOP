package FasadaUbranie;

public class FasadaWiosennegoUbioru implements IUbranieNaPoreRoku {
    private Bielizna _bielizna;
    private Dres _dres;
    private Trampki _trampki;

    public FasadaWiosennegoUbioru(Bielizna bielizna, Dres dres, Trampki trampki){
        _bielizna = bielizna;
        _dres = dres;
        _trampki = trampki;
    }
    @Override
    public void ubierzSie() {
        _bielizna.ubierzUbranie();
        _dres.ubierzUbranie();
        _trampki.ubierzUbranie();
    }
    @Override
    public void rozbierzSie() {
        _trampki.rozbierzUbranie();
        _dres.rozbierzUbranie();
        _bielizna.rozbierzUbranie();
    }
}
