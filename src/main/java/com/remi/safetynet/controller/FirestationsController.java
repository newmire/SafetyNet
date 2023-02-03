package com.remi.safetynet.controller;

import com.remi.safetynet.model.Firestations;
import com.remi.safetynet.service.FirestationsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirestationsController {
    private final FirestationsService firestationsService;

    public FirestationsController(FirestationsService firestationsService) {
        this.firestationsService = firestationsService;
    }

    @GetMapping("/firestations")
    public List<Firestations> getFirestations() {
        return firestationsService.getFirestations();
    }

}
