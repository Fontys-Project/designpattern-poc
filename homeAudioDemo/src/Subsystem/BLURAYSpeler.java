package Subsystem;

import Interfaces.BlurayInterface;


public class BLURAYSpeler implements BlurayInterface {


    private Versterker versterker;

    public BLURAYSpeler(Versterker versterker) {
        this.versterker = versterker;
    }

    public void aan() {
        System.out.println("Blu-Ray speler wordt aangezet...");
    }

    public void uit() {
        System.out.println("Blu-ray speler wordt uitgezet...");
    }

    public void eject() {
        System.out.println("Blu-Ray wordt geëjecteerd...");
    }

    public void pause() {
        System.out.println("Blu-Ray gepauseerd!");
    }
    public void afspelen(String film){
        System.out.println(film+" wordt afgespeeld...");
    }
    public void stop(){
        System.out.println("Blu-ray is gestopt!");
    }


}
