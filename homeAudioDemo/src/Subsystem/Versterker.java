package Subsystem;


import Interfaces.BlurayInterface;

import java.sql.SQLOutput;

public class Versterker {
    private BlurayInterface bluraySpeler;
    private CDSpeler cdSpeler;
    private int volume;
    private boolean dolbyAudio;

    public Versterker(BlurayInterface bluraySpeler, CDSpeler cdSpeler) {
        this.bluraySpeler = bluraySpeler;
        this.cdSpeler = cdSpeler;
        this.volume = 0;
        this.dolbyAudio = false;
    }

    public void setDolbyAudio(boolean dolbyAudio) {
        this.dolbyAudio = dolbyAudio;

    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume is gezet op " + volume + "%");
    }

    public void aan() {
        System.out.println("Versterker aangezet!");
    }

    public void uit() {
        System.out.println("Versterker uigezet!");
    }


}
