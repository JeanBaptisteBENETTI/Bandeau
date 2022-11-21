package solution;

import bandeau.Bandeau;
import java.awt.*;

public class Clignotant extends Effet {

    public void excecuter(Bandeau b) {
        b.setMessage("Clignotant");
        b.sleep(100);
        b.setMessage("");
        b.sleep(100);

    }
}
