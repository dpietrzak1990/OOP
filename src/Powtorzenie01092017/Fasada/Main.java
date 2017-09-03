package Powtorzenie01092017.Fasada;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Proszek proszek = new Proszek();
        CukierPuder cp = new CukierPuder();
        Talk talk = new Talk();

        ProporcjeFasada pf = new ProporcjeFasada(robot, proszek, cp, talk);
        pf.UruchomProdukcje();
    }
}
