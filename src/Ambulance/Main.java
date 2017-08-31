package Ambulance;

public class Main {
    public static void main(String[] args) {
        OperatorAdam operator = new OperatorAdam();
        FirstAmbulance pierwszy = new FirstAmbulance(operator);
        SecondAmbulance drugi = new SecondAmbulance(operator);
        ThirdAmbulance trzeci = new ThirdAmbulance(operator);

        operator.setStatus("Karambol na A4");
        operator.setStatus("Pobicie na ulicy Dworcowej");
        operator.setStatus("Poród");
    }
}
