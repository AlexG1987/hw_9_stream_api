package main.java.teamusers;

import java.time.LocalDate;

class Users {

    private final String email;
    private final LocalDate loginTime;
    private final String team;

    public Users(String email, LocalDate loginTime, String team) {
        this.email = email;
        this.loginTime = loginTime;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getLoginTime() {
        return loginTime;
    }

    public String getTeam() {
        return team;
    }
}
