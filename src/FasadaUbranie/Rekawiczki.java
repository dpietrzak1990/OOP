package FasadaUbranie;

public class Rekawiczki implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Włóż rękawiczki");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmij rękawiczki");
    }
}
