package Decorateur;
// import java.util.*;

import Model.CoupeGlacee;

/**
 * 
 */
public class CoulisFraise extends Topping {

    /**
     * Default constructor
     */
    public CoulisFraise(CoupeGlacee cg) {
        super(cg);
    }

    public float extraCout() {
        return 1f;
    }

    public String extraDescription() {
        return "fraise";
    }

    public float cout() {
        return (super.cout() + extraCout());
    }

    public String desciption() {
        return (super.description() + extraDescription());
    }

}