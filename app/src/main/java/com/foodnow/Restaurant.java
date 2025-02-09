package com.foodnow;

import java.util.ArrayList;

public class Restaurant {

    String name;
    int logo;
    int cover;
    String address;
    String openHours;
    ArrayList<Food> menu;
    String id;

    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLogo() {
        return logo;
    }

    public int getCover() {
        return cover;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Food> getMenu() {
        return menu;
    }

    public Restaurant(String name, int logo, int cover, String address, String openHours) {
        this.name = name;
        this.logo = logo;
        this.cover = cover;
        this.address = address;
        this.openHours = openHours;
    }

    public Restaurant()
    {}

    public void setMenu(ArrayList<Food> menu) {
        this.menu = menu;
    }

    public String getOpenHours() {
        return openHours;
    }
}
