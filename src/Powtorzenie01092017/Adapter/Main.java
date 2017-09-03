package Powtorzenie01092017.Adapter;

public class Main {
    public static void main(String[] args) {
        DolceGusto dg = new DolceGusto();
        DolceGustoToTassimoAdapter dolce = new DolceGustoToTassimoAdapter(dg);
        dolce.TassimoCoffe();
    }
}
