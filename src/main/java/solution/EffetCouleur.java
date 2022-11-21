package solution;

import bandeau.Bandeau;
import java.awt.*;

public class EffetCouleur extends Effet {

    public void excecuter(Bandeau b) {
        b.setMessage("On va changer de couleur de fond");
        b.sleep(1000);
        b.setBackground(Color.DARK_GRAY);
        b.setMessage("On va changer de couleur");
        b.sleep(1000);
        b.setForeground(Color.YELLOW);
        b.sleep(1000);

    }
}
