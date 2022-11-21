package solution;

public class NombreRepetition {

    private Effet effet;
    private int nbreRepet;

    public NombreRepetition(Effet e, int nbreRepet) {
        this.effet = e;
        this.nbreRepet = nbreRepet;
    }

    public int getNbreRepet() {
        return nbreRepet;
    }

    public Effet getEffet() {
        return effet;
    }
}
