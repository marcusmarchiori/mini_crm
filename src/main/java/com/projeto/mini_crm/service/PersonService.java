package com.projeto.mini_crm.service;

import com.projeto.mini_crm.data.PersonData;

import java.util.List;

public interface PersonService {

    PersonData getPerson(String id);
    PersonData createPerson(PersonData personData);
    PersonData deletePerson(String id);
    List<PersonData> findPeople(String nameContains);

}
