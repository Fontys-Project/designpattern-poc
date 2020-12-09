package Motormanagement;

public class KoelingController {
    private Radiator radiator;
    private TemperatuurSensor temperatuurSensor;

    public KoelingController() {
        this.radiator = new Radiator();
        this.temperatuurSensor = new TemperatuurSensor();
    }

    public void setTemperatuurlimiet() {

    }

    public void start() {
    }

    public void koelen(int temp) {
        temperatuurSensor.getTemperatuur();
        radiator.aan();
    }

    public void stop() {
        radiator.uit();
    }

}
