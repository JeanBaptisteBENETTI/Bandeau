package solution;

import bandeau.Bandeau;
import java.awt.*;
import java.util.ArrayList;

public class Scenario {

    private ArrayList<NombreRepetition> lesEffets;

    public Scenario() {
        this.lesEffets = new ArrayList<>();
    }

    public void ajouterEffet(Effet e, int nbreRept) {
        NombreRepetition rp = new NombreRepetition(e, nbreRept);
        lesEffets.add(rp);
    }

    public void excecuter() {
        Bandeau b = new Bandeau();
        for (NombreRepetition rp : lesEffets) {
            for (int i = 0; i < rp.getNbreRepet(); i++) {
                rp.getEffet().excecuter(b);
            }

        }
    }

}
