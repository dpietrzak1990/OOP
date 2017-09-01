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

        FasadaLetniegoUbioru flu = new FasadaLetniegoUbioru(boks, shr, tsh, skar, san, czap );
        StrategiaUbioru su = new StrategiaUbioru(flu);

                su.ubieramySie();
        System.out.println("------");
        su.rozbieramySie();
//        su.setPoraRoku();    //zmieniamy pore roku !
    }
}

