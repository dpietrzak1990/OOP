package Singleton;

/**
 * Created by RENT on 2017-09-01.
 */
public class Singleton {
    private static Singleton _instancja;

    private Singleton(){}

    public static Singleton getINstance(){
        if(_instancja == null){
            _instancja = new Singleton();
        }
        return _instancja;

    }
}
