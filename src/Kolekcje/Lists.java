package Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RENT on 2017-09-05.
 */
public class Lists {
    public static void main(String[] args) {

//        int[] ints = new int[]{1,2,3,4,5,6,7,8,9};
//        Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8,9};
        Integer[] integers2 = new Integer[]{10,11,12,13};

        int [] tab = new int[10];

        for(int i = 0; i < 10; i++){
            tab[i] = i;
        }
        for(int i : tab){
            System.out.println(i);
        }
        Integer[] tablica = new Integer[10];

        for(int j = 0; j <10; j++){
            tablica[j] = j;
        }
        for(Integer j : tablica ){
            System.out.println(j);
        }
        List l1 = Arrays.asList(tab);
        List l2 = Arrays.asList(tablica);

        List<Integer> l3 = new ArrayList();
        l3.addAll(l2);


        List<Integer> l4 = new ArrayList<>();
        l4.addAll(l2);
//        l4.addAll(l22)

    }
}
