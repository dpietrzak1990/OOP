package StacjaPogodowa;

/**
 * Created by RENT on 2017-08-29.
 */
public class WarunkiBiezace implements IWyswietl, IObserwator {

    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;
    private IPodmiot _danePogodnowe;

    WarunkiBiezace(IPodmiot danePogodnowe){
        _danePogodnowe = danePogodnowe;
        _danePogodnowe.zarejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPA, %f %%\n", _temperatura, _cisnienie, _wilgotnosc);
    }
    @Override
    public void aktualizuj(float temperatura, float cisnienie, float wilgotnosc) {
      _temperatura = temperatura;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        wyswietl();
    }
}
