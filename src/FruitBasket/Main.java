package FruitBasket;

/**
 * Created by RENT on 2017-09-06.
 */
public class Main {
    public static void main(String[] args) {
        Apple app = new Apple();
        Basket<Apple> kosz = new Basket<>();
        kosz.setFruit(app);
        System.out.println(kosz.getFruitName());
        System.out.println(kosz.getFruitColor());
        System.out.println(kosz.getFruitShape());
    }
}
