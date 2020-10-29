package com.projeto.mini_crm.service.impl;

import com.projeto.mini_crm.data.AddressData;
import com.projeto.mini_crm.data.ContactData;
import com.projeto.mini_crm.data.PersonData;
import com.projeto.mini_crm.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public PersonData getPerson(String id) {
        return new PersonData("João da Silva", "João", 25, true, "1234567890", new AddressData("Uberlandia", "Minas Gerais",
                "Av. Joao Naves de Avila", 2121, "38408-100"), new ContactData("joao@mail.com", "(34)99999-9999)"));
    }

    public PersonData createPerson(PersonData personData) {
        return new PersonData("João da Silva", "João", 25, true, "1234567890", new AddressData("Uberlandia", "Minas Gerais",
                "Av. Joao Naves de Avila", 2121, "38408-100"), new ContactData("joao@mail.com", "(34)99999-9999)"));
    }

    public PersonData deletePerson(String id) {
        return new PersonData("João da Silva", "João", 25, true, "1234567890", new AddressData("Uberlandia", "Minas Gerais",
                "Av. Joao Naves de Avila", 2121, "38408-100"), new ContactData("joao@mail.com", "(34)99999-9999)"));
    }

    public List<PersonData> findPeople(String nameContains) {
        return Arrays.asList(new PersonData("João da Silva", "João", 25, true, "1234567890", new AddressData("Uberlandia", "Minas Gerais",
                "Av. Joao Naves de Avila", 2121, "38408-100"), new ContactData("joao@mail.com", "(34)99999-9999)")));
    }
    
}
