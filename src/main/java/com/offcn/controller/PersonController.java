package com.offcn.controller;

import com.offcn.bean.Person;
import com.offcn.dao.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(path = "/findAll",method = RequestMethod.GET)
    public List<Person> findAll(){
        return personService.findAll();
    }

    @RequestMapping(path = "add",method = RequestMethod.POST)
    public String addPerson(Person person){
        personService.save(person);
        return "success";
    }
    @DeleteMapping(path="deletePerson")
    public String deletePerson(@RequestParam int id) {
        personService.deleteById(id);
        return "删除";
    }

    @PutMapping(path="updatePerson")
    public String updatePerson(@RequestBody Person person) {
        personService.saveAndFlush(person);
        return "修改";
    }
}
