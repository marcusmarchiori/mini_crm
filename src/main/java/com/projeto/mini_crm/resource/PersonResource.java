package com.projeto.mini_crm.resource;

import com.projeto.mini_crm.data.AddressData;
import com.projeto.mini_crm.data.ContactData;
import com.projeto.mini_crm.data.PersonData;
import com.projeto.mini_crm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonResource {

    @Autowired // Injeta o PersonService aqui
    private PersonService personService;

    @GetMapping("/person/{id}")
    public PersonData getPerson(@PathVariable String id) {
        return personService.getPerson(id);
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
        return personService.deletePerson(id);
    }

    @GetMapping("/person")
    public List<PersonData> findPeople(@RequestParam(value = "nameContains", required = true) String nameContains) {
        return (List<PersonData>) personService.findPeople(nameContains);
    }
}
