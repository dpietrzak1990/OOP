package ArraySercherException;



/**
 * Created by RENT on 2017-09-06.
 */
public class ArraySercher {
    public String findElement(String[] strAA, String element){
        for(int i = 0; i < strAA.length;i++){
            if(element.equals(strAA[i])){
                return element;
            }
        }
       throw new ArrayStoreException("Nie znaleziono nic");
    }
}
