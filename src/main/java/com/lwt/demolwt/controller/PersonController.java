package com.lwt.demolwt.controller;

import com.lwt.demolwt.model.Person;
import com.lwt.demolwt.repo.IPersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

  @Autowired
  IPersonRepo personRepo;

  @GetMapping
  public List<Person> getPersons(){
      return personRepo.findAll();
  }

}
