package main.java.boxesthings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Boxes {

    private static List<Things> fragileThings = (Arrays.asList(
            new Things("Cup"),
            new Things("Mirror"),
            new Things("Bottle"),
            new Things("Plate")));
    private List<Things> thingsList = new ArrayList<>();

public Boxes() {
        Random random = new Random();
        List<Things> strongThings = (Arrays.asList(
                new Things("Paper"),
                new Things("Notepad"),
                new Things("Pencil"),
                new Things("Fork"),
                new Things("Spoon"),
                new Things("Pen")));
        int totalItem = 5;
        List<Things> list = Stream.concat(fragileThings.stream(), strongThings.stream())
                .collect(Collectors.toList());
        for (int i = 0; i < totalItem; i++) {
            int randomIndex = random.nextInt(list.size());
            this.thingsList.add(list.get(randomIndex));
        }

    }

    public static void protectFragileItems(List<Boxes> boxList) {
        boxList.stream().flatMap(boxes -> boxes.thingsList.stream())
                .filter(t -> (fragileThings.stream()
                        .map(Things::getName).collect(Collectors.toList()).contains(t.getName())))
                        .map(Protector::new)
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
    }

    public String toString() {
        return "Box" + this.thingsList;
    }

}


