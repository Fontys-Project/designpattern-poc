package Motormanagement;

public class LuchtdrukController {
    private LuchtMassaMeter luchtMassaMeterm;

    public LuchtdrukController() {
        this.luchtMassaMeterm = new LuchtMassaMeter();
    }

    public void luchtIntake() {
        luchtMassaMeterm.getLuchtmassa();

    }

    public void stop() {
    }
}
