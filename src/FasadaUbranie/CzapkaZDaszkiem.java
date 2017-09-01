package FasadaUbranie;

public class CzapkaZDaszkiem implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Zakładam Czapkę");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuję czapkę");
    }
}
