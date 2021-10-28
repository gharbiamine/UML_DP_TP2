package Commande;

import java.io.PrintWriter;
import java.util.*;

import Model.IProduit;

public class Commande {

    public Commande() {
    }

    public List<IProduit> lesCoupes = new ArrayList<IProduit>();

    public void publieFacture(PrintWriter writer) {
        float total = 0;
        for (Iterator<IProduit> it = this.lesCoupes.iterator(); it.hasNext();) {
            IProduit coupe = (IProduit) it.next();
            writer.println(coupe.description() + " + " + coupe.cout());
            total = total + coupe.cout();
        }
        writer.println(" TOTAL : " + total);
    }

}