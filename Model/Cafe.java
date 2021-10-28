package Model;

public class Cafe extends Boisson {

    public static final Cafe SINGLETON = new Cafe();
    private String variete;

    public Cafe(String variete) {
        this.variete = variete;
    }

    Cafe() {
    }

    public void setvariete(String variete) {
        this.variete = variete;
    }

    @Override
    public float cout() {
        return 1.5f;
    }

    @Override
    public String description() {
        return "Cafe " + variete;
    }
}