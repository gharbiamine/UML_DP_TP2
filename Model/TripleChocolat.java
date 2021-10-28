package Model;

import Decorateur.Parfum;

public class TripleChocolat extends CoupeGlacee {
    public static final TripleChocolat SINGLETON = new TripleChocolat();

    private TripleChocolat() {
        this.parfums.add(Parfum.CHOCOBLANC);
        this.parfums.add(Parfum.CHOCOLAIT);
        this.parfums.add(Parfum.CHOCONOIR);
    }

    public static TripleChocolat getTripleChocolat() {
        return SINGLETON;
    }

    public float cout() {
        return 6;
    }
}
