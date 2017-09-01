package FasadaUbranie;

public class Bluza implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Zakładam bluzę");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuję bluzę");
    }
}
