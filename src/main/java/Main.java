package main.java;

import main.java.boxesthings.Boxes;
import main.java.movies.Cinema;
import main.java.ownfunctionalinterface.FunctionalInterfaceImplementation;
import main.java.teamusers.TeamUsers;

class Main {

    public static void main(String[] args) {
        FunctionalInterfaceImplementation.runImplementation();
        TeamUsers.printUserTeamList();
        Cinema.printCountMoviesByGenre("fantastic");
        Cinema.printAverageTicketPriceByGenre();
        Boxes.printProtectedFragileItems();
    }
}
