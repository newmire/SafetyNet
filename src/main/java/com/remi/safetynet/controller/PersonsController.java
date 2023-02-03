package com.remi.safetynet.controller;

import com.remi.safetynet.model.Persons;
import com.remi.safetynet.service.PersonsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsController {
    private final PersonsService personsService;

    public PersonsController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/communityEmail")
    public List<String> getEmailByCity(@RequestParam(name = "city") String city) {
        return this.personsService.findAllEmail(city);
    }
}
