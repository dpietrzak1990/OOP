package FasadaUbranie;

/**
 * Created by RENT on 2017-08-31.
 */
public class StrategiaUbioru {
    private IUbranieNaPoreRoku _ubranieNaPoreRoku;

    public StrategiaUbioru(IUbranieNaPoreRoku ubranieNaPoreRoku){
        _ubranieNaPoreRoku = ubranieNaPoreRoku;
    }
    public void ubieramySie(){
        _ubranieNaPoreRoku.ubierzSie();
    }
    public void rozbieramySie(){
        _ubranieNaPoreRoku.rozbierzSie();
    }
    public void setPoraRoku(IUbranieNaPoreRoku ubranieNaPoreRoku){
        _ubranieNaPoreRoku = ubranieNaPoreRoku;
    }
}
