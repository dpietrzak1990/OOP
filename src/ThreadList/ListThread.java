package ThreadList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * Created by RENT on 2017-09-04.
 */
public class ListThread implements Runnable {
    private ArrayList<Integer> _stageOne = new ArrayList<>();
    private ArrayList<Integer> _stageTwo = new ArrayList<>();

    private Random rand = new Random();

    public void stageOne() throws InterruptedException {
        _stageOne.add(rand.nextInt());
        Thread.sleep(1);
    }
    public synchronized void stageTwo() throws InterruptedException {
        _stageTwo.add(rand.nextInt());
        Thread.sleep(1);
    }
    public void process() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }
    @Override
    public void run() {
        try {
            process();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}