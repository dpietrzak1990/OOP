package Powtorzenie01092017.Strategia;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {

        Parzyste par = new Parzyste();
        Nieparzyste npar = new Nieparzyste();
        StrategiaKoniaBonifacego skb = new StrategiaKoniaBonifacego(par);

        for (int i :skb.uruchomAlgorytm()) {
            System.out.println(i);
        }
        System.out.println("-------------");
        skb.setBetaAlgorytm(npar);
        for (int i :skb.uruchomAlgorytm()) {
            System.out.println(i);
        }
    }
}
