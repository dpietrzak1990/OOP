package Ambulance;

public class SecondAmbulance implements IAmbulans {
    private IOperator _operator;

    public SecondAmbulance(IOperator operator){
        _operator = operator;
        operator.registerObserver(this);
    }
    @Override
    public void update() {

    }
    private void driveToIncident(){
        System.out.println(SecondAmbulance.class.getSimpleName() + "Jade do wypadku!");
        System.out.println("Incident: " + _operator.getStatus());
    }
}
