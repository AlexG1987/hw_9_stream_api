package main.java.teamusers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeamUsers {

    private static final List<Users> loginUsersList = Arrays.asList(
            new Users("benedict@user.com", LocalDate.parse("2019-07-18"), "Scouts"),
            new Users("scott@user.com", LocalDate.parse("2019-07-04"), "Avengers"),
            new Users("john@user.com", LocalDate.parse("2019-07-08"), "Scouts"),
            new Users("alex@user.com", LocalDate.parse("2019-07-10"), "Avengers"),
            new Users("jessica@user.com", LocalDate.parse("2019-07-15"), "Yankees"),
            new Users("sally@user.com", LocalDate.parse("2019-07-14"), "Yankees"),
            new Users("alice@user.com", LocalDate.parse("2019-07-09"), "Avengers")
    );

    public static void printUserTeamList() {
        System.out.println("<== Task two. Logon users list ==>");
        Map<String, List<String>> collect = loginUsersList.stream()
                .filter(User -> User.getLoginTime()
                        .isAfter(LocalDate.now().minusDays(7)))
                .collect(Collectors.groupingBy(Users::getTeam, Collectors.mapping(Users::getEmail, Collectors.toList())));
        System.out.println("* Users, who logged on less a week ago: ");
        for (Map.Entry<String, List<String>> stringStringEntry : collect.entrySet()) {
            System.out.println("Team: " + ((Map.Entry) stringStringEntry).getKey() +
                    " Users: " + ((Map.Entry) stringStringEntry).getValue());
        }


    }
}