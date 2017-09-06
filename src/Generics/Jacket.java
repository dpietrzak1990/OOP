package Generics;

/**
 * Created by RENT on 2017-09-06.
 */
public class Jacket extends Clothes {
    @Override
    public String getDescription() {
        return "Niebieska kurtka";
    }

    @Override
    public String getName() {
        return "Kurtka";
    }

    @Override
    public String getSize() {
        return "L";
    }
}
