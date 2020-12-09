package Motormanagement;

public class BrandstofInjector {

    private BrandstofPomp brandstofPomp;

    public BrandstofInjector() {
        this.brandstofPomp = new BrandstofPomp();
    }

    public void injecteren(){
        brandstofPomp.pompen();
    }
    public void aan(){}
    public void uit(){

    }
}
