package Powtorzenie01092017.Strategia;

import FasadaUbranie.StrategiaUbioru;

/**
 * Created by RENT on 2017-09-01.
 */
public abstract class StrategiaKoniaBonifacego {
    private IAlgorytm _algorytm;

    public StrategiaKoniaBonifacego(IAlgorytm algorytm){
        _algorytm = algorytm;
    }
    public void setBetaAlgorytm(IAlgorytm algorytm){
        _algorytm = algorytm;
    }
    public int [] uruchomAlgorytm(){
        return _algorytm.Uruchom();
    }
}
