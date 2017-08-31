package Fasada;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
        Telewizor tv = new Telewizor();
        ThermoMix tm = new ThermoMix();
        Wzmacniacz wzm = new Wzmacniacz();

        FasadaKinaDomowego fkd = new FasadaKinaDomowego(tv, tm, wzm);
        fkd.wychodzZDomu();
        System.out.println("---------");
        fkd.wrocDoDomu();
    }
}
