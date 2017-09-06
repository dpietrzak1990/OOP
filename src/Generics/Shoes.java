package Generics;

/**
 * Created by RENT on 2017-09-06.
 */
public class Shoes extends Clothes {
    @Override
    public String getDescription() {
        return "Białe buty";
    }

    @Override
    public String getName() {
        return "Buty";
    }

    @Override
    public String getSize() {
        return "46";
    }
}
