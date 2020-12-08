package Subsystem;

import java.util.concurrent.TimeUnit;

public class PopcornMaker {


    public void aan() {
        System.out.println("Popcornmaker aangezet");
    }

    public void uit() {
        System.out.println("Popcornmaker uitgezet");

    }

    public void bereiden() {
        try {
            System.out.print("Pop...");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("....pop");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("..pop");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("..pop");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("..pop");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("..pop");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("..pop");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("..pop");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("................pop.............");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
