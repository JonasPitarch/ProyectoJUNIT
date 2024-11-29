package com.jonas;

public class Equipo {
    private String team;
    private String city;
    private String img;

    public Equipo(String team, String city, String img) {
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
