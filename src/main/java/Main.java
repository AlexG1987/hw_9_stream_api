package main.java;

import main.java.boxesthings.Boxes;
import main.java.movies.Cinema;
import main.java.teamusers.TeamUsers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
class Main {

    public static void main(String[] args) {

        OwnFunctionalInterface ownFunctionalInterface = (list) -> list.stream().map((str) -> (str.replace("$", "s")))
                .forEach(System.out::println);

        System.out.println("<== First task. Own functional interface ==>");
        List<String> lines = new ArrayList<>();
        lines.add("Fir$t line");
        lines.add("$econd line");
        lines.add("Third line");
        System.out.println("* Lines before modification: ");
        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("* Lines after modification: ");
        ownFunctionalInterface.modifyString(lines);
        System.out.println();

        System.out.println("<== Task two. Logon users list ==>");
        TeamUsers.printUserTeamList();
        System.out.println();

        System.out.println("<== Task three. Cinema movie list ==>");
        Cinema.printMoviesByGenre("fantastic");
        System.out.println("* The average price for movies by genre is: ");
        System.out.println(Cinema.printAveragePriceByGenre());
        System.out.println();

        System.out.println("<== Task four. Fragile things protection in the box ==>");

        List<Boxes> boxList = Arrays.asList(new Boxes(), new Boxes(), new Boxes(), new Boxes());
        System.out.println("* List of protected fragile things: ");
        Boxes.protectFragileItems(boxList);

    }
}
