package FasadaUbranie;

/**
 * Created by RENT on 2017-08-31.
 */
public class Skarpetki implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("ubieram skarpetki");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("rozbieram skarpetki");
    }
}
