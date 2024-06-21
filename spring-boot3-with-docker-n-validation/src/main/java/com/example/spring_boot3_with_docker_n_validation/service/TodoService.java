package com.example.spring_boot3_with_docker_n_validation.service;

import com.example.spring_boot3_with_docker_n_validation.model.StatusType;
import com.example.spring_boot3_with_docker_n_validation.model.Todo;
import com.example.spring_boot3_with_docker_n_validation.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
@AllArgsConstructor
public class TodoService {
    final TodoRepository todoRepository;

    public List<Todo> getAll(){
        return todoRepository.findAll();
    }

    public Todo save(Todo newTodo){
        if (newTodo.getId()==null){
            newTodo.setCreatedAt(LocalDateTime.now());
        }
        newTodo.setUpdatedAt(LocalDateTime.now());
        return todoRepository.save(newTodo);
    }

    public List<Todo> getAllByStatus(StatusType statusType) {
        return  todoRepository.findByStatus(statusType);
    }

    public Todo getById(Long id) {
        return todoRepository.findById(id).orElseThrow();
    }
}
