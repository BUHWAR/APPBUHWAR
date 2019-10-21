package com.smartlines.buhwar.model;

public class VisitadoModel {
    private String name;
    private String lastName;
    private String adress;
    private String email;

    public VisitadoModel(String name, String lastName, String adress, String email) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.email = email;
    }

    public VisitadoModel() {
        this.name = "";
        this.lastName = "";
        this.adress = "";
        this.email = "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
