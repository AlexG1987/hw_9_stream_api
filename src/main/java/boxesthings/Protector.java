package main.java.boxesthings;

public class Protector {

    private Things thing;

    public Protector(Things thing) {
        this.thing = thing;
    }

    public String getName() {
        return thing.getName();
    }

    @Override
    public String toString(){
      return "Protector " + thing;
    }

}
