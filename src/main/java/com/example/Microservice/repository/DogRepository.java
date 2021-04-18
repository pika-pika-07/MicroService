package com.example.Microservice.repository;

import com.example.Microservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Long> {

}
