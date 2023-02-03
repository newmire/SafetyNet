package com.remi.safetynet.model;

import java.util.List;

public class Firestations {
    private String adresse;
    private String station;

    public Firestations() {

    }

    public Firestations(String adresse, String station) {

        this.adresse = adresse;
        this.station = station;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

}
