package FasadaUbranie;

/**
 * Created by RENT on 2017-08-31.
 */
public class Sandaly implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("zakładam sandały");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("zdejmuję sandały");
    }
}
