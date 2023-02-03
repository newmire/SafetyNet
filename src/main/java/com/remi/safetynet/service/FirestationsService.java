package com.remi.safetynet.service;

import com.remi.safetynet.model.Firestations;
import com.remi.safetynet.repository.FirestationsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FirestationsService {
    private final FirestationsRepository firestationsRepository;

    public FirestationsService(FirestationsRepository firestationsRepository) {
        this.firestationsRepository = firestationsRepository;
    }
    public List<Firestations> getFirestations(){
        List<Firestations> result = new ArrayList<>();
        List<Firestations> all = firestationsRepository.findAllFirestations();
        result.add(all.get(0));
        return result;
    }
}
