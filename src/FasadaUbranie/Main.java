package FasadaUbranie;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
        Skarpetki skar = new Skarpetki();
        Sandaly san = new Sandaly();

        FasadaLetniegoUbioru flu = new FasadaLetniegoUbioru(san, skar);
        StrategiaUbioru su = new StrategiaUbioru(flu);

        su.ubieramySie();
        System.out.println("------");
        su.rozbieramySie();
//        su.setPoraRoku();    //zmieniamy pore roku !
    }
}
