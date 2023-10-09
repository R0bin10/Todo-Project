package com.robin.todo.controller;

import com.robin.todo.payload.request.TaskDTO;
import com.robin.todo.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class TaskController {

    final
    TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/my-tasks")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> listMyTasks(Authentication user) {

        return ResponseEntity.ok(taskService.getTasksByUserName(user.getName()));

    }

    @PostMapping("/add-task")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> addNewTask(Authentication user, @RequestBody TaskDTO taskDTO){
        taskService.addNewTaskToUser(user.getName(), taskDTO);
        return ResponseEntity.ok().build();
    }
}
