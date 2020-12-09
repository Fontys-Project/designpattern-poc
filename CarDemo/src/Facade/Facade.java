package Facade;

import Motormanagement.*;

import java.sql.SQLOutput;

public class Facade {
    private KoelingController koelingController;
    private LuchtdrukController luchtdrukController;
    private Startmotor startmotor;
    private BrandstofInjector brandstofInjector;
    private Katalysator katalysator;
    private final int DEFAULT_TEMP = 90;
    private final int MAX_TEMP = 50;

    public Facade() {


        this.startmotor = new Startmotor();
        this.koelingController = new KoelingController();
        this.luchtdrukController = new LuchtdrukController();
        this.brandstofInjector = new BrandstofInjector();
        this.katalysator = new Katalysator();

    }

    public void aan() {
        System.out.println("Lucht inlaat aangezet!");
        luchtdrukController.luchtIntake();
        System.out.println("Brandstofinjectoren gereed!");
        brandstofInjector.aan();
        System.out.println("Brndstof injecteren!");
        brandstofInjector.injecteren();
        System.out.println("Startmotor starten!");
        startmotor.start();
        System.out.println("Koeling starten!");
        koelingController.setTemperatuurlimiet();
        koelingController.koelen(DEFAULT_TEMP);
        System.out.println("Katalysator starten!");
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
