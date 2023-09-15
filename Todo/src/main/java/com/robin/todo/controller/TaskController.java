package com.robin.todo.controller;

import com.robin.todo.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TaskController {

    final
    TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/my-tasks")
    public ResponseEntity<?> listMyTasks(Authentication authentication) {

        return ResponseEntity.ok(taskService.getTasksByUserName(authentication.getName()));

    }
}
