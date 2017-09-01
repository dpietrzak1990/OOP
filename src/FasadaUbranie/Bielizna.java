package FasadaUbranie;

public class Bielizna implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram bieliznę");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuję bieliznę");
    }
}
