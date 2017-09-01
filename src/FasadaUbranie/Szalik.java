package FasadaUbranie;

public class Szalik implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubierz szalik");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmij szalik");
    }
}
