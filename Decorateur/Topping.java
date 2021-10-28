package Decorateur;
// import java.util.*;

import Model.IProduit;

/**
 * 
 */
public class Topping implements IProduit {

    private IProduit Associe;

    public float cout() {
        return this.Associe.cout();
    }

    public String description() {
        return Associe.description();
    }

    public Topping(IProduit cg) {
        this.Associe = cg;
    }

}