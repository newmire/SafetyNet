package com.remi.safetynet.controller;

import com.remi.safetynet.model.MedicalRecords;
import com.remi.safetynet.service.MedicalRecordsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicalRecordsController {
    private final MedicalRecordsService medicalRecordsService;

    public MedicalRecordsController(MedicalRecordsService medicalRecordsService) {
        this.medicalRecordsService = medicalRecordsService;
    }
    @GetMapping("/medicalrecords")
    public List<MedicalRecords> getMedicalRecords(){
        return medicalRecordsService.getMedicalRecords();
    }

}
