package FasadaUbranie;

public class Trampki implements Iubranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Zakładam cichobiegi firmy Szelest");
    }
    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuję cichobiegi");
    }
}
