package com.pg.rest.repository;

import com.pg.rest.model.Request;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface RequestRepository extends CrudRepository<Request, String> {
}
