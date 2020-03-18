package com.lwt.demolwt.repo;

import com.lwt.demolwt.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepo extends JpaRepository<Person, Integer> {
}
