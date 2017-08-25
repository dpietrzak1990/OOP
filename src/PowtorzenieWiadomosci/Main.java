package PowtorzenieWiadomosci;

/**
 * Created by RENT on 2017-08-25.
 */
public class Main {
    public static void main(String[] args) {
        MyTime mtime = new MyTime(23, 59, 59);
        System.out.println(mtime);
        mtime.nextSecond();
        System.out.println(mtime);
    }
}
