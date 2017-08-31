package Ambulance;

public class ThirdAmbulance implements IAmbulans {
    private IOperator _operator;

    public ThirdAmbulance(IOperator operator){
        _operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {

    }
    public void driveToIncident(){
        System.out.println(ThirdAmbulance.class.getSimpleName() + "Potwierdzam zgłoszenie, jadę do wypadku.");
        System.out.println("Incident: " + _operator.getStatus());
    }
}
