package com.springpractice.recipedemo.repositories;

import com.springpractice.recipedemo.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
