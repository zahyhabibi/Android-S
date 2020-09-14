package com.example.customlistview;

public class Hero {
    public static int getNama;
    public int getTeam;
    int image;
    String name, team;

    public Hero(int image,String name,String team){
        this.image = image;
        this.team = team;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }
    }


