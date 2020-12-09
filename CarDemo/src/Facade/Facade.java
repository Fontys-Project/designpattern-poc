package Facade;

import Motormanagement.*;

public class Facade {
    private KoelingController koelingController;
    private Radiator radiator;
    private TemperatuurSensor temperatuurSensor;
    private BrandstofPomp brandstofPomp;
    private LuchtMassaMeter luchtMassaMeter;
    private LuchtdrukController luchtdrukController;
    private Startmotor startmotor;
    private BrandstofInjector brandstofInjector;
    private Katalysator katalysator;
    private final int DEFAULT_TEMP = 90;
    private final int MAX_TEMP = 50;

    public Facade() {

        this.radiator = new Radiator();
        this.temperatuurSensor = new TemperatuurSensor();
        this.brandstofPomp = new BrandstofPomp();
        this.luchtMassaMeter = new LuchtMassaMeter();
        this.startmotor = new Startmotor();
        this.temperatuurSensor = new TemperatuurSensor();
        this.koelingController = new KoelingController();
        this.luchtdrukController = new LuchtdrukController();
        this.brandstofInjector = new BrandstofInjector();
        this.katalysator = new Katalysator();

    }

    public void aan() {
        luchtdrukController.luchtIntake();
        brandstofInjector.aan();
        brandstofInjector.injecteren();
        startmotor.start();
        koelingController.setTemperatuurlimiet();
        koelingController.koelen(DEFAULT_TEMP);
        katalysator.aan();

    }

    public void uit() {
        brandstofInjector.uit();
        koelingController.koelen(MAX_TEMP);
        koelingController.stop();
        katalysator.uit();
        luchtdrukController.stop();

    }

}
