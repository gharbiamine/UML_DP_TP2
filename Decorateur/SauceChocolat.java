package Decorateur;

import Model.IProduit;

// import java.util.*;

/**
 * 
 */
public class SauceChocolat extends Topping {

    /**
     * Default constructor
     */
    public SauceChocolat(IProduit cg) {
        super(cg);
    }

    public float extraCout() {
        return 0.7f;
    }

    public String extraDescription() {
        return "sauce choco ";
    }

    public float cout() {
        return (super.cout() + extraCout());
    }

    public String description() {
        // System.out.println("here");
        return (super.description() + extraDescription());
    }

}