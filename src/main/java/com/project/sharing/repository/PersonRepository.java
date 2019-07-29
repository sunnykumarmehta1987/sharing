package com.project.sharing.repository;

import com.project.sharing.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface PersonRepository extends JpaRepository<Person,Long> {




}
