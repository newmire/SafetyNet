package com.remi.safetynet.service;

import com.remi.safetynet.model.MedicalRecords;
import com.remi.safetynet.repository.MedicalRecordsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicalRecordsService {
    private final MedicalRecordsRepository medicalRecordsRepository;

    public MedicalRecordsService(MedicalRecordsRepository medicalRecordsRepository) {
        this.medicalRecordsRepository = medicalRecordsRepository;
    }

    public List<MedicalRecords> getMedicalRecords() {
        List<MedicalRecords> result = new ArrayList<>();
        List<MedicalRecords> all = medicalRecordsRepository.findAllMedicalsRecords();
        result.add(all.get(0));
        return result;

    }


}
