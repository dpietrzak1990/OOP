package FasadaUbranie;

public class Kurtka implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubierz kurtkę");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmij kurtkę");
    }
}
