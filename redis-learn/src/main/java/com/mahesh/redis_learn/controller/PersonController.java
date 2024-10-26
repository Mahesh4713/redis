package com.mahesh.redis_learn.controller;


import com.mahesh.redis_learn.dto.PersonCreateRequest;
import com.mahesh.redis_learn.model.Person;
import com.mahesh.redis_learn.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/")
    public void createPerson(@RequestBody @Valid PersonCreateRequest request){
        personService.create(request.to());
    }

    @GetMapping("/")
    public Person getPerson(@RequestParam("id") String personId){
        return personService.get(personId);
    }

    @GetMapping("/all")
    public List<Person> getPeople(){
        return personService.get();
    }
}
