package Powtorzenie01092017.Adapter;

public class DolceGustoToTassimoAdapter implements ITassimo {
    private IDolceGusto _dolce;

    public DolceGustoToTassimoAdapter(IDolceGusto dolce){
        _dolce = dolce;
    }
    @Override
    public void TassimoCoffe() {
        _dolce.DolceGustoCoffe();
    }
}
