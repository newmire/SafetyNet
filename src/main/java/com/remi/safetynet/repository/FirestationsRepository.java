package com.remi.safetynet.repository;

import com.remi.safetynet.model.Firestations;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FirestationsRepository {
    private final DataHolder dataHolder;

    public FirestationsRepository(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
    }
        public List<Firestations> findAllFirestations () {
            return dataHolder.getData().getFirestations();
    }
}
