package Ambulance;

public class FirstAmbulance implements IAmbulans {
    private IOperator _operator;

    public FirstAmbulance(IOperator operator){
        _operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncient();
    }
    public void driveToIncient(){
        System.out.println(FirstAmbulance.class.getSimpleName() + "Zgłoszenie otrzymane, jadę do wypadku.");
        System.out.println("Incident: " + _operator.getStatus());
    }
}
