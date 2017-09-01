package FasadaUbranie;

public class Tshirt implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Zakładam T-shirt");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuję T-shirt");
    }
}
