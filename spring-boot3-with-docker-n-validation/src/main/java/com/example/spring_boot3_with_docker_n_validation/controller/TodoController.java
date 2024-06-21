package com.example.spring_boot3_with_docker_n_validation.controller;

import com.example.spring_boot3_with_docker_n_validation.model.StatusType;
import com.example.spring_boot3_with_docker_n_validation.model.Todo;
import com.example.spring_boot3_with_docker_n_validation.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodoController {
    final TodoService todoService;

    @PutMapping("/todos/{id}")
    public Todo updateTodoItem(@PathVariable("id") long id) {
        Todo updatedTodo = todoService.getById(id);
        if (updatedTodo.getStatus() == StatusType.BACKLOG) {
            updatedTodo.setStatus(StatusType.DOING);
        } else if (updatedTodo.getStatus() == StatusType.DOING) {
            updatedTodo.setStatus(StatusType.DONE);
        }

        return todoService.save(updatedTodo);
    }
}
