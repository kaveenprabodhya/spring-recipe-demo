package com.springpractice.recipedemo.repositories;

import com.springpractice.recipedemo.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
