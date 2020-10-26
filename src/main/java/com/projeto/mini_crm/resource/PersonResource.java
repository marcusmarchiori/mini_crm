package com.projeto.mini_crm.resource;

import com.projeto.mini_crm.data.PersonData;
import com.projeto.mini_crm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonResource {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/{id}")
    public PersonData getPerson(@PathVariable String id) {
        return new PersonData("João da Silva", "João", "joao@mail.com", 25, true, "1234567890");
    }

    @PostMapping("/person")
    public PersonData createPerson(@RequestBody PersonData personData) {
        return personService.createPerson(personData);
    }

    @PutMapping("/person/{id}")
    public PersonData updatePerson(@PathVariable String id, @RequestBody PersonData personData) {
        return personData;
    }

    @DeleteMapping("/person/{id}")
    public PersonData deletePerson(@PathVariable String id) {
        return new PersonData("João da Silva", "João", "joao@mail.com", 25, true, "1234567890");
    }

    @GetMapping("/person")
    public List<PersonData> findPeople(@RequestParam(value = "nameContains", required = true) String nameContains) {
        return Arrays.asList(new PersonData("João da Silva", "João", "joao@mail.com", 25, true, "1234567890"));
    }
}
