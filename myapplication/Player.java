package com.example.myapplication;

import java.util.ArrayList;

public class Player {
    private Integer number;
    private String name;
    private ArrayList<Integer> points;

    public Player(Integer number, String name, ArrayList<Integer> points) {
        this.number = number;
        this.name = name;
        this.points = points;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }

    public String toString(){
        return "Number: " + number +
                "Name: " + name +
                "Points: " + points;
    }
}
