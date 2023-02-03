package com.remi.safetynet.repository;

import com.remi.safetynet.model.Persons;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonsRepository {
    private final DataHolder dataHolder;

    public PersonsRepository(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
    }

    public List<Persons> findAllPersons() {
        return dataHolder.getData().getPersons();
    }

}
