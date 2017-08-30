package Kawiarnia;

/**
 * Created by RENT on 2017-08-30.
 */
public class MocnoPalona extends Napoj {

    public MocnoPalona() {
        super.opis = "MocnoPalona";
    }
    @Override
    public double koszt() {
        return 0.99;
    }
}
