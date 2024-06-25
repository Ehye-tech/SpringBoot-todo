package com.example.spring_boot3_with_docker_n_validation.controller;
import com.example.spring_boot3_with_docker_n_validation.model.StatusType;
import com.example.spring_boot3_with_docker_n_validation.model.Todo;
import com.example.spring_boot3_with_docker_n_validation.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class PageController {
    final TodoService todoService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView =  new ModelAndView("index");
        modelAndView.addObject("newTodo", new Todo());
        modelAndView.addObject("backlog", todoService.getAllByStatus(StatusType.BACKLOG));
        modelAndView.addObject("doing", todoService.getAllByStatus(StatusType.DOING));
        modelAndView.addObject("done", todoService.getAllByStatus(StatusType.DONE));

        return modelAndView;
    }
}
