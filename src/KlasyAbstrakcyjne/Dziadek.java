package KlasyAbstrakcyjne;

/**
 * Created by RENT on 2017-08-23.
 */
public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.printf("Za moich czasów...!\n");
    }

    @Override
    public void walczOMiejsceWAutobisue() {
        System.out.printf("Wali laską po nogach\n");
    }
    public void zapalPapierosa(){
        System.out.printf("Palę szluga\n");
    }
}
