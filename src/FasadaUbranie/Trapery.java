package FasadaUbranie;

public class Trapery implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Załóż trapery");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmij trapery");
    }
}
