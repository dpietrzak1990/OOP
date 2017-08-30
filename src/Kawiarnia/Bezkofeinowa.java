package Kawiarnia;

/**
 * Created by RENT on 2017-08-30.
 */
public class Bezkofeinowa extends Napoj {

    public Bezkofeinowa(){
        super.opis = "Bezkofeinowa";
    }
    @Override
    public double koszt() {
        return 1.05;
    }
}
