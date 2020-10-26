package com.projeto.mini_crm.service.impl;

import com.projeto.mini_crm.data.PersonData;
import com.projeto.mini_crm.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public PersonData createPerson(PersonData personData) {
        return new PersonData("João da Silva", "João", "joao@mail.com", 25, true, "1234567890");
    }
}
