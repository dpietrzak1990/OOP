package Fasada;

/**
 * Created by RENT on 2017-08-31.
 */
public class FasadaKinaDomowego {
    private Telewizor _telewizor;
    private ThermoMix _thermoMic;
    private Wzmacniacz _wzmacniacz;

    public FasadaKinaDomowego(Telewizor tv, ThermoMix tm, Wzmacniacz wzm){
        _telewizor = tv;
        _thermoMic = tm;
        _wzmacniacz = wzm;
    }
    public void wrocDoDomu(){
        _thermoMic.wlacz();
        _thermoMic.zrobObiad();
        _wzmacniacz.wlacz();
        _telewizor.wlacz();
        _telewizor.ustawKanal();
        _telewizor.ustawGlosnosc();
    }
    public void wychodzZDomu(){
        _thermoMic.wylacz();
        _telewizor.wylacz();
        _wzmacniacz.wylacz();
    }
}
