package Powtorzenie01092017.Fasada;

    public class ProporcjeFasada {
        private Robot _robot;
        private Proszek _proszek;
        private CukierPuder _cp;
        private Talk _talk;

    public ProporcjeFasada(Robot robot, Proszek proszek, CukierPuder cp, Talk talk) {
        _robot = robot;
        _proszek = proszek;
        _cp = cp;
        _talk = talk;
    }
    public void UruchomProdukcje(){
        _robot.UruchomRobota();
        _proszek.Dodaj();
        _cp.Dodaj();
        _talk.Dodaj();
        _robot.MieszajSkladniki();
        _robot.WylaczRobota();
    }
}
