package com.remi.safetynet.repository;

import com.remi.safetynet.model.Firestations;
import com.remi.safetynet.model.MedicalRecords;
import com.remi.safetynet.model.Persons;

import java.util.List;

public class Data {
    private List<Persons> persons;
    private List<MedicalRecords> medicalrecords;
    private List<Firestations> firestations;

    public List<Persons> getPersons() {
        return persons;
    }

    public void setPersons(List<Persons> persons) {
        this.persons = persons;
    }

    public List<MedicalRecords> getMedicalrecords() {
        return medicalrecords;
    }

    public void setMedicalrecords(List<MedicalRecords> medicalrecords) {
        this.medicalrecords = medicalrecords;
    }

    public List<Firestations> getFirestations() {
        return firestations;
    }

    public void setFirestations(List<Firestations> firestations) {
        this.firestations = firestations;
    }
}
