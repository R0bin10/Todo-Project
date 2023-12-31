package com.robin.todo.service;

import com.robin.todo.payload.request.TaskDto;
import com.robin.todo.payload.response.TaskListResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    List<TaskListResponse> getTasksByUserName(String username);

    void addNewTaskToUser(String username, TaskDto taskDTO);
}
