package com.jonas;

import java.util.List;

public class Conference {
    private List<Team> teams;

    public Conference(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }
}
