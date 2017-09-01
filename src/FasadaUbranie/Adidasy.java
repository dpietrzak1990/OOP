package FasadaUbranie;

public class Adidasy implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Zakładam adidasy");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuję adidasy");
    }
}
