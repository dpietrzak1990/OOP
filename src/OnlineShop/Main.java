package OnlineShop;



/**
 * Created by RENT on 2017-08-23.
 */
public class Main {
    public static void main(String[] args) {

        IProduct ChineseDemocracy = new ChineseDemocracy();
        ChineseDemocracy.setPrice(50);
        ChineseDemocracy.setProductName("Guns n' Roses");

        IProduct ZdrajcaMetalu = new ZdrajcaMetalu();
        ZdrajcaMetalu.setPrice(20);
        ZdrajcaMetalu.setProductName("Nocny Kochanek");

    }
}
