package Sorter;

/**
 * Created by RENT on 2017-08-28.
 */
public class sortowaniePrzezZliczanie implements ISort {

    @Override
    public int[] sort(int[] tab) {
        int max = getMax(tab);
        int[] countTab = new int[max+1];

        for(int i = 0; i < tab.length; i++){
            countTab[tab[i]]++;
        }
        int[] finalTab = new int[tab.length];
        int iterator = 0;
        for(int i = 0; i < countTab.length; i++){
            while (countTab[i] > 0)
            {
                finalTab[iterator] = i;
                countTab[i]--;
                iterator++;
            }
        }
        return finalTab;
    }
    private int getMax(int[] tab){
        int max = 0;
        for(int i =0; i < tab.length; i++){
            if(max < tab[i]){
                max = tab[i];
            }
        }
        return max;
    }
    }
