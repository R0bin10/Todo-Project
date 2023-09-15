package com.robin.todo.service;

import com.robin.todo.models.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    List<Task> getTasksByUserName(String username);

}
