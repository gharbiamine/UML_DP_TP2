import java.io.PrintWriter;

import Commande.Commande;
import Decorateur.*;
import Model.*;

public class Store {

    public Store() {
    }

    public static void main(String[] args) {
        Commande cmd = new Commande();
        IProduit cd = new Chantilly((new SauceChocolat(TripleChocolat.getTripleChocolat())));
        IProduit b = new Chantilly(new Cafe("creme "));
        IProduit c = new Chantilly(new SauceChocolat(new ChocolatChaud()));
        cmd.lesCoupes.add(cd);
        cmd.lesCoupes.add(b);
        cmd.lesCoupes.add(c);
        PrintWriter pw = new PrintWriter(System.out, true);
        cmd.publieFacture(pw);
    }
}