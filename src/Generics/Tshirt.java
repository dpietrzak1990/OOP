package Generics;

/**
 * Created by RENT on 2017-09-06.
 */
public class Tshirt extends Clothes implements ICanBeFolded {
    @Override
    public String getDescription() {
        return "Czarna koszulka";
    }

    @Override
    public String getName() {
        return "koszulka";
    }

    @Override
    public String getSize() {
        return "L";
    }
}
