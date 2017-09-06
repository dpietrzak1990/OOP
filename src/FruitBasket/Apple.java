package FruitBasket;

/**
 * Created by RENT on 2017-09-06.
 */
public class Apple extends Fruit implements IPutInTheBasket {

    @Override
    public String getName() {
        return "Jabłko";
    }

    @Override
    public String getColor() {
        return "Zielone";
    }

    @Override
    public String getShape() {
        return "Okrągłe";
    }
}
