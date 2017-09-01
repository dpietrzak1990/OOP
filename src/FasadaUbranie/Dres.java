package FasadaUbranie;

public class Dres implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Zakładam dres, dres fajny jest!");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuję dres");

    }
}
