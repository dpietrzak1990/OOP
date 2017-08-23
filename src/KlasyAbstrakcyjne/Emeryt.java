package KlasyAbstrakcyjne;

/**
 * Created by RENT on 2017-08-23.
 */
public abstract class Emeryt {
    public static final int IloscOczu = 2;
    public abstract void krzyczNaDzieci();

    public abstract void walczOMiejsceWAutobisue();

    public void biegnijDoSklepu(int odległość, int prędkość){
        double czas = (double)odległość/prędkość;
        System.out.println("Biegnę do sklepu po kiełbasę będę za" +czas);
    }
}
