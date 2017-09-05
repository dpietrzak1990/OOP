package Kolekcje.Queque;

/**
 * Created by RENT on 2017-09-05.
 */
public class Person {
    private String _name;
    private String _shoppingList;

    public Person(String name, String shoppingList){
        _name = name;
        _shoppingList = shoppingList;
    }

    public String getName(){
        return _name;
    }
    public String UnpackShopping(){
        return "Wypakowuje na taśmociąg:" + _shoppingList;
    }

}
