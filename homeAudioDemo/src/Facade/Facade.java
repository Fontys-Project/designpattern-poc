package Facade;

import Interfaces.BlurayInterface;
import Subsystem.*;

import java.util.concurrent.TimeUnit;


public class Facade {
    private AmbiLight ambiLight;
    private CDSpeler cdSpeler;
    private BlurayInterface bluraySpeler;
    private PopcornMaker popcornMaker;
    private Projector projector;
    private Versterker versterker;
    private Whitescreen whitescreen;

    public Facade() {
        this.ambiLight = new AmbiLight();
        this.versterker = new Versterker(bluraySpeler, cdSpeler);
        this.cdSpeler = new CDSpeler(versterker);
        this.bluraySpeler = new BLURAYSpeler(versterker) {
        };
        this.popcornMaker = new PopcornMaker();
        this.projector = new Projector(bluraySpeler);
        this.whitescreen = new Whitescreen();
    }


    public void filmStarten()  {

        try {

            System.out.println("\n--------Eten-------\n");
            popcornMaker.aan();
            popcornMaker.bereiden();
            TimeUnit.SECONDS.sleep(3);


            System.out.println("\n--------Lichten-------\n");
            ambiLight.aan();
            ambiLight.dimmen(20);
            TimeUnit.SECONDS.sleep(3);


            System.out.println("\n--------Scherm-------\n");
            whitescreen.uitklappen();
            TimeUnit.SECONDS.sleep(2);
            projector.aan();
            TimeUnit.SECONDS.sleep(3);

            System.out.println("\n--------Versterker-------\n");
            versterker.aan();
            versterker.setDolbyAudio(true);
            versterker.setVolume(60);
            TimeUnit.SECONDS.sleep(3);


            System.out.println("\n--------Blu-ray-speler-------\n");
            bluraySpeler.aan();
            bluraySpeler.afspelen("Lord of the rings: The Fellowship of the ring");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void filmStoppen() {

    }

    public void cdStarten() {

    }

    public void cdStoppen() {

    }
}
