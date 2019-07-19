package main.java.boxesthings;

class Things {

    private final String name;

    Things(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "*" + this.name + "*";
    }

}
