package com.offcn.controller;

import com.offcn.bean.Person;
import com.offcn.dao.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController1 {

    @Autowired
    private PersonService personService;

    @GetMapping("/findByName/{userName}")
    public Person findByName(@PathVariable(name = "userName") String userName){
        return personService.findByUserName(userName);
    }

    @GetMapping("/getByUserName/{userName}")
    public List<Person> getByUserName(@PathVariable(name = "userName")String userName){
        return personService.getByUserName(userName);
    }
}
