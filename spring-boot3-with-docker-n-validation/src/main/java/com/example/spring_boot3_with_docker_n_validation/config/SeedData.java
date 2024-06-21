package com.example.spring_boot3_with_docker_n_validation.config;

import com.example.spring_boot3_with_docker_n_validation.model.StatusType;
import com.example.spring_boot3_with_docker_n_validation.model.Todo;
import com.example.spring_boot3_with_docker_n_validation.repository.TodoRepository;
import com.example.spring_boot3_with_docker_n_validation.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SeedData implements CommandLineRunner {
    final TodoService todoService;

    @Override
    public void run(String ...args) throws Exception{
        List<Todo> todos = todoService.getAll();
        Todo todo1 = Todo.builder().description("wash dishes").status(StatusType.DONE).build();
        Todo todo2 = Todo.builder().description("submit resumes").status(StatusType.DOING).build();
        Todo todo3 = Todo.builder().description("do laundries").status(StatusType.BACKLOG).build();

        todoService.save(todo1);
        todoService.save(todo2);
        todoService.save(todo3);
    }
}
