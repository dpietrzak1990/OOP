package Kawiarnia;

/**
 * Created by RENT on 2017-08-30.
 */
public class Espresso extends Napoj {

    public Espresso() {
        super.opis = "Espresso";
    }
    @Override
    public double koszt() {
        return 1.99;
    }
}
