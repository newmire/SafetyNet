package com.remi.safetynet.model;

public class Firestations {
    private Integer id;
    private String adresse;
    private String station;

    public Firestations(int id, String adresse, String station) {
        this.id = id;
        this.adresse = adresse;
        this.station = station;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString(){
        return "Firestations{" + "id=" + id + ", station" + station ;
    }
}
