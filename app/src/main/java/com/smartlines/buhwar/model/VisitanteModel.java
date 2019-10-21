package com.smartlines.buhwar.model;

public class VisitanteModel {

    private String name;
    private String lastNema;
    private String noControl;
    private String mDate;
    private String mTime;
    private String suspect;

    public VisitanteModel(String name, String lastNema, String noControl, String mDate, String mTime, String suspect) {
        this.name = name;
        this.lastNema = lastNema;
        this.noControl = noControl;
        this.mDate = mDate;
        this.mTime = mTime;
        this.suspect = suspect;
    }

    public VisitanteModel() {
        this.name = "";
        this.lastNema = "";
        this.noControl = "";
        this.mDate = "";
        this.mTime = "";
        this.suspect = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNema() {
        return lastNema;
    }

    public void setLastNema(String lastNema) {
        this.lastNema = lastNema;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public String getSuspect() {
        return suspect;
    }

    public void setSuspect(String suspect) {
        this.suspect = suspect;
    }
}
