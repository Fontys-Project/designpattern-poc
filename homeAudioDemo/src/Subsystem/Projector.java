package Subsystem;

public class Projector {
    private BLURAYSpeler bluraySpeler;

    public Projector(BLURAYSpeler bluraySpeler) {
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
