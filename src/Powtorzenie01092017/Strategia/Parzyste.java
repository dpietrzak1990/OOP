package Powtorzenie01092017.Strategia;

/**
 * Created by RENT on 2017-09-01.
 */
public class Parzyste implements IAlgorytm {
    @Override
    public int[] Uruchom() {
        int [] tab = new int [30];
        int it2 = 1;
        for(int j = 0; j < 30; j++){
            tab[j] = it2;
            it2 = it2 + 1;
        }
        return tab;
    }
}
