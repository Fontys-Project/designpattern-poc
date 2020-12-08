package Subsystem;

public class AmbiLight {


    public void aan(){
        System.out.println("Lichten zijn aangezet!");
    }
    public void uit(){
        System.out.println("Lichten zijn uitgezet!");
    }

    public void dimmen(int percentage){
        System.out.println("Lichten zijn gedimd op: "+ percentage+"%");
    }
}
