package Ambulance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-08-29.
 */
public class OperatorAdam implements IOperator {
    List<IAmbulans> ambulanse = new ArrayList<>();
    private String status = "";


    @Override
    public void registerObserver(IAmbulans ambulans) {
        ambulanse.add(ambulans);
    }
    @Override
    public void removeObserver(IAmbulans ambulans) {
        ambulanse.remove(ambulans);
    }
    @Override
    public void notifyObservers() {
        for (IAmbulans ambulans : ambulanse) {
            ambulans.update();
        }
    }
    @Override
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
