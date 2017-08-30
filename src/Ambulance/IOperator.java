package Ambulance;

/**
 * Created by RENT on 2017-08-29.
 */
public interface IOperator {
    void registerObserver();
    void removeObserver();
    void notifyObservers();
    String getStatus();
}
