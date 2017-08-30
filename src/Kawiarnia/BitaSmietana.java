package Kawiarnia;

/**
 * Created by RENT on 2017-08-30.
 */
public class BitaSmietana extends SkladnikiDekorator {
    private Napoj _napoj;
    public BitaSmietana(Napoj napoj){
        _napoj = napoj;
    }
    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " Bita Smietana";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.10;
    }
}
