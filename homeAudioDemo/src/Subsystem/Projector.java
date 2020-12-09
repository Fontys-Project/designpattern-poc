package Subsystem;

import Interfaces.BlurayInterface;

public class Projector {
    private BlurayInterface bluraySpeler;

    public Projector(BlurayInterface bluraySpeler) {
        this.bluraySpeler = bluraySpeler;
    }

    public void aan() {
        System.out.println("Projector aangezet!");
    }

    public void uit() {
        System.out.println("Projector uitgezet!");

    }

    public void mode() {

    }
}
