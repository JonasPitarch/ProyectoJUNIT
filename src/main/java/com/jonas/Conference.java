package com.jonas;

import java.util.List;

public class Conference {
    private List<Equipo> teams;

    public Conference(List<Equipo> teams) {
        this.teams = teams;
    }

    public List<Equipo> getTeams() {
        return teams;
    }
}
