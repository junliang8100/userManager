package com.offcn.dao;

import com.offcn.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonService extends JpaRepository<Person,Integer> {

    public Person findByUserName(String userName);

    @Query("select p from Person p where p.userName like %:userName%")
    public List<Person> getByUserName(String userName);
}
