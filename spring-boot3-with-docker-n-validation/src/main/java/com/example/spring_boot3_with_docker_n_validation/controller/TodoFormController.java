package com.example.spring_boot3_with_docker_n_validation.controller;

import ch.qos.logback.core.model.Model;
import com.example.spring_boot3_with_docker_n_validation.model.StatusType;
import com.example.spring_boot3_with_docker_n_validation.model.Todo;
import com.example.spring_boot3_with_docker_n_validation.service.TodoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class TodoFormController {
    final TodoService todoService;

    @PostMapping("/todos/new")
    public String createTodo(@Valid Todo newTodo) {
        newTodo.setStatus(StatusType.BACKLOG);
        todoService.save(newTodo);
        return "redirect:/";
    }
}
