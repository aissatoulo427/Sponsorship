package com.isi.sponsorship.Entity;



public class Role {
    private int id;
    private String name;
    private int etat;

    public Role(int id, String name, int etat) {
        this.id = id;
        this.name = name;
        this.etat = etat;
    }

    public Role() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}

