package Generics;

/**
 * Created by RENT on 2017-09-06.
 */
public class Main {
    public static void main(String[] args) {
//      Shoes shoe = new Shoes();
        Tshirt tsh = new Tshirt();
        Suitcase<Tshirt> suitcase = new Suitcase<>();
        suitcase.setThing(tsh);
        System.out.println(suitcase.getThingName());
        System.out.println(suitcase.getThingSize());
    }
}
