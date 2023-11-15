/**
 * 
 */
package com.springbootproject.DMS.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springbootproject.DMS.Models.Dog;



/**
 * Author Chandi Priya Katta
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
List<Dog> findByName(String name);
}
