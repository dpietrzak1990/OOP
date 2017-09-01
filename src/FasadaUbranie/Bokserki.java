package FasadaUbranie;

public class Bokserki implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Zakładam majty");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuję majty");
    }
}
