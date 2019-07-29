package com.project.sharing.Controller;

import com.project.sharing.model.Person;
import com.project.sharing.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sharingdetails/api/v1")
public class PersonController {
    @Autowired
    PersonRepository personRepository;


  @PostMapping("/persons")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
          personRepository.save(person);

    return  new  ResponseEntity<Person>(HttpStatus.CREATED);


  }

  @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAllPersons(){
     // personRepository.findAll();
      List<Person> list=personRepository.findAll();
      return new  ResponseEntity<List<Person>>(list,HttpStatus.OK);
  }





}
