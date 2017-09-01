package FasadaUbranie;

public class Czapka implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Załóż czapkę");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmij czapkę");
    }
}
