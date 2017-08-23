package OnlineShop;

import CircleAndCylinder.Circle;

/**
 * Created by RENT on 2017-08-23.
 */
public abstract class MusicCD implements IProduct {
    protected int price;
    protected String name;
    protected String title;
    protected String performer;

    public int getPrice(){
        return price;
    }
    public void setProductName(String name){
        this.name = name;
    }
    public String getProductName(){
        return name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getPerformer(){
        return performer;
    }
    public void setPerformer(String performer){
        this.performer = performer;
    }
}
