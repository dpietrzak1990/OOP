package StacjaPogodowa;

/**
 * Created by RENT on 2017-08-29.
 */
public interface IPodmiot {
    void zarejestrujObserwatora(IObserwator o);
    void usunObserwatora(IObserwator o);
    void powiadomObserwatora();
}
