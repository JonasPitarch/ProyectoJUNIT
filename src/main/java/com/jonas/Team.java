package com.jonas;

public class Team {
    public String team;
    public String city;
    public String img;

    public Team(String team, String city, String img) {
        this.team = team;
        this.city = city;
        this.img = img;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
