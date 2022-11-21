package solution;

import bandeau.Bandeau;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        TourComplet tc = new TourComplet();
        Clignotant c = new Clignotant();
        EffetCouleur ef = new EffetCouleur();
        Zoom z = new Zoom();
        CaractereParCaractere cp = new CaractereParCaractere();

        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        //tc.excecuter(monBandeau);
        //c.excecuter(monBandeau);
        //ef.excecuter(monBandeau);
        //z.excecuter(monBandeau);
        //cp.excecuter(monBandeau);

        Scenario scenario = new Scenario();
        scenario.ajouterEffet(c, 50);
        scenario.excecuter();

    }


}
