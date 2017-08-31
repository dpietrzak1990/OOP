package Adapter;

/**
 * Created by RENT on 2017-08-31.
 */
public class KaczkaAdapter implements IIndyk {
    private IKaczka _kaczka;
    public KaczkaAdapter(IKaczka kaczka){
        _kaczka = kaczka;
    }

    @Override
    public void gulgocz() {
        _kaczka.kwacz();
    }
    @Override
    public void lataj() {
        _kaczka.lataj();
    }
}
