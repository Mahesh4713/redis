package com.mahesh.redis_learn.service;


import com.mahesh.redis_learn.model.Person;
import com.mahesh.redis_learn.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void create(Person person){
        personRepository.set(person);
    }
    public Person get(String personId) {
        return personRepository.getById(personId);
    }
    public List<Person> get(){
        Set<String> keys = personRepository.getAllKeys();
        return keys.stream()
                .map(k -> personRepository.getByKey(k))
                .collect(Collectors.toList());
    }
}
