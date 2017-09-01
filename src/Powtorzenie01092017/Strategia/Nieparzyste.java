package Powtorzenie01092017.Strategia;

/**
 * Created by RENT on 2017-09-01.
 */
public class Nieparzyste implements IAlgorytm {

    @Override
    public int[] Uruchom() {
        int[] tab = new int[30];
        int it =1;
        for(int i = 0; i < 30; i++){
            tab[i] = it;
            it = it + 2;
        }
        return  tab;
    }
}
