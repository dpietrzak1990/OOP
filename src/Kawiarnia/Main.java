package Kawiarnia;

/**
 * Created by RENT on 2017-08-30.
 */
public class Main {
    public static void main(String[] args) {
        MocnoPalona mp = new MocnoPalona();
        Czekolada czek = new Czekolada(mp);
        System.out.printf("Nazwa: %s :: Cena: %.2f\n", czek.pobierzOpis(), czek.koszt());

        Espresso es = new Espresso();
        Czekolada czeko = new Czekolada(es);
        BitaSmietana bit = new BitaSmietana(czeko);
        System.out.printf("Nazwa: %s :: Cena: %.2f\n", bit.pobierzOpis(), bit.koszt());

        Bezkofeinowa bez = new Bezkofeinowa();
        MleczkoSojowe ms = new MleczkoSojowe(bez);
        BitaSmietana bita = new BitaSmietana(ms);
        Czekolada czekolada = new Czekolada(bita);
        System.out.printf("Nazwa: %s :: Cena: %.2f", czekolada.pobierzOpis(), czekolada.koszt());

    }
}
