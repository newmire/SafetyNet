package com.remi.safetynet.service;

import com.remi.safetynet.model.Persons;
import com.remi.safetynet.repository.PersonsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonsService {
    private final PersonsRepository personsRepository;

    public PersonsService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public List<Persons> getPersons() {
        List<Persons> result = new ArrayList<>();
        List<Persons> all = personsRepository.findAllPersons();
        result.add(all.get(0));
        return result;
    }

    public List<String> findAllEmail(String city) {
        List<String> result = new ArrayList<>();
        List<Persons> people = personsRepository.findAllPersons();
        for (Persons person : people) {
            if (person.getCity().equals(city)) {
                result.add(person.getEmail());
            }
        }
        return result;

    }
}