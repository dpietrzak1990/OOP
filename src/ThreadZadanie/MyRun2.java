package ThreadZadanie;

import SimpleThread.MyRun;

/**
 * Created by RENT on 2017-09-04.
 */
public class MyRun2 implements Runnable {
    private String _name;

    public MyRun2(String name){
        _name = name;
    }
    @Override
    public void run() {
        for(int i = 0; i <10; i++){
            System.out.printf("Hello from thread %s\n",_name);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("Goodbye");
    }
}
