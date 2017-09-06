package FruitBasket;

/**
 * Created by RENT on 2017-09-06.
 */
public class Basket <T extends Fruit & IPutInTheBasket>{
    private T _fruit;

    public T getFruit(){
        return _fruit;
    }
    public void setFruit(T fruit){
        _fruit = fruit;
    }
    public String getFruitName(){
        return _fruit.getName();
    }
    public String getFruitColor(){
        return _fruit.getColor();
    }
    public String getFruitShape(){
        return _fruit.getShape();
    }
}
