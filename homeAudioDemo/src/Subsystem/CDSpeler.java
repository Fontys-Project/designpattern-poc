package Subsystem;

public class CDSpeler {

private Versterker versterker;

    public CDSpeler(Versterker versterker) {
        this.versterker = versterker;
    }

    public void aan() {
        System.out.println("CD-speler is wordt aangezet...");
    }

    public void uit() {
        System.out.println("CD-speler wordt uitgezet...");
    }

    public void eject() {
        System.out.println("CD wordt geëjecteerd...");
    }

    public void pause() {
        System.out.println("CD-speler gepauseerd!");
    }
    public void afspelen(){
        System.out.println("CD wordt afgespeeld...");
    }
    public void stop(){
        System.out.println("CD-speler is gestopt!");
    }
}

