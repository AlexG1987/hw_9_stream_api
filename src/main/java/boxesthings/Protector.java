package main.java.boxesthings;

public class Protector {

    private Things thing;

    public Protector(Things thing) {
        this.thing = thing;
    }

    @Override
    public String toString() {
        return "Protector " + thing;
    }

}
