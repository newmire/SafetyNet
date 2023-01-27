package com.remi.safetynet.repository;

import com.remi.safetynet.model.MedicalRecords;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MedicalRecordsRepository {
    private final DataHolder dataHolder;

    public MedicalRecordsRepository(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
    }
    public List<MedicalRecords> findAllMedicalsRecords(){
        return dataHolder.getData().getMedicalrecords();
    }
}
