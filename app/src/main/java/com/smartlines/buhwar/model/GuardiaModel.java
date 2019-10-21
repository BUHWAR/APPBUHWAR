package com.smartlines.buhwar.model;

public class GuardiaModel {
    private String name;
    private int noControl;
    private String img;
    private boolean status;

    public GuardiaModel(String name, int noControl, String img, boolean status) {
        this.name = name;
        this.noControl = noControl;
        this.img = img;
        this.status = status;
    }

    public GuardiaModel() {
        this.name = "";
        this.noControl = 0;
        this.img = "";
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
