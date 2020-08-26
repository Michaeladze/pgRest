package com.pg.rest.repository;

import com.pg.rest.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Category, String> {
}
