package KlasyAbstrakcyjne;

/**
 * Created by RENT on 2017-08-23.
 */
public class Babcia extends Emeryt {

    @Override
    public void krzyczNaDzieci() {
        System.out.printf("Zostaw ziemniaki, a mięso zjedz!\n");
    }
    @Override
    public void walczOMiejsceWAutobisue() {
        System.out.printf("Walę torbą przez łeb!\n");
    }
}
