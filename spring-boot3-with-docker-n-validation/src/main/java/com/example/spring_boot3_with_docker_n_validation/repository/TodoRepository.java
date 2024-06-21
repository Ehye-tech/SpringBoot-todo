package com.example.spring_boot3_with_docker_n_validation.repository;

import com.example.spring_boot3_with_docker_n_validation.model.StatusType;
import com.example.spring_boot3_with_docker_n_validation.model.Todo;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface TodoRepository extends ListCrudRepository<Todo, Long> {

    List<Todo> findByStatus(StatusType statusType);
}
