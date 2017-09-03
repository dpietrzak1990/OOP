package FasadaUbranie;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
        Skarpetki skar = new Skarpetki();
        Sandaly san = new Sandaly();
        Bokserki boks = new Bokserki();
        Shorty shr = new Shorty();
        Tshirt tsh = new Tshirt();
        CzapkaZDaszkiem czap = new CzapkaZDaszkiem();
        Bielizna biel = new Bielizna();
        Dres dres = new Dres();
        Trampki tramp = new Trampki();

        FasadaLetniegoUbioru flu = new FasadaLetniegoUbioru(boks, shr, tsh, skar, san, czap );
        FasadaWiosennegoUbioru fwu = new FasadaWiosennegoUbioru(biel, dres, tramp);

        StrategiaUbioru su = new StrategiaUbioru(flu);
        su.ubieramySie();
        System.out.println("------");
        su.rozbieramySie();
        System.out.println("-------");
        su.setPoraRoku(fwu);
        su.ubieramySie();
        System.out.println("--------");
        su.rozbieramySie();
    }
}

