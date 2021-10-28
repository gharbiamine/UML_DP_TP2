package Decorateur;

import Model.IProduit;

// import java.util.*;

/**
 * 
 */
public class Chantilly extends Topping {

    /**
     * Default constructor
     */
    public Chantilly(IProduit cg) {
        super(cg);
    }

    public float extraCout() {
        return 0.5f;
    }

    public String extraDescription() {
        return "chantilly ";
    }

    public float cout() {
        return (super.cout() + extraCout());
    }

    public String description() {
        return (super.description() + extraDescription());
    }

}