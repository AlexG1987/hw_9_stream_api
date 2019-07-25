package main.java.ownfunctionalinterface;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaceImplementation {

    static void modifyString(List<String> lines) {
        OwnFunctionalInterface ownFunctionalInterface = (list) -> list.stream().map((str) -> (str.replace("$", "s")))
                .forEach(System.out::println);

        System.out.println("* Lines before modification: ");
        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("* Lines after modification: ");
        ownFunctionalInterface.modifyString(lines);
        System.out.println();
    }

    public static void runImplementation() {
        System.out.println("* First task. Own functional interface *");
        List<String> linesList = new ArrayList<>();
        linesList.add("Fir$t line");
        linesList.add("$econd line");
        linesList.add("Third line");
        FunctionalInterfaceImplementation.modifyString(linesList);
    }
}
