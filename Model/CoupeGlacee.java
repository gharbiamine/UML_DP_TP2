package Model;

import java.util.*;

import Decorateur.Parfum;

public abstract class CoupeGlacee implements IProduit {

    protected List<Parfum> parfums = new ArrayList<Parfum>();

    protected CoupeGlacee() {
    }

    public String description() {
        StringBuffer sb = new StringBuffer("");
        sb.append("Coupe ");
        for (Iterator<Parfum> it = parfums.iterator(); it.hasNext();) {
            sb.append(it.next().toString());
            sb.append(" ");
        }
        return sb.toString();
    }

    public abstract float cout();

}