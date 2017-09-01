package FasadaUbranie;

public class Jeansy implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Zakładam jeansy");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuję jeansy");
    }
}
