package main.java.boxesthings;

class Protector {

    private final Things thing;

    public Protector(Things thing) {
        this.thing = thing;
    }

    @Override
    public String toString() {
        return "Protector " + thing;
    }

}
