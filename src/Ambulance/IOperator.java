package Ambulance;

/**
 * Created by RENT on 2017-08-29.
 */
public interface IOperator {
    void registerObserver(IAmbulans ambulans);
    void removeObserver(IAmbulans ambulans);
    void notifyObservers();
    String getStatus();
}
