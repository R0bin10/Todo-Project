package com.robin.todo.service;

import com.robin.todo.models.Task;
import com.robin.todo.models.User;
import com.robin.todo.repository.TaskRepository;
import com.robin.todo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    final
    TaskRepository taskRepository;

    final
    UserRepository userRepository;


    public TaskServiceImpl(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Task> getTasksByUserName(String username) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            //TODO Map tasks to DTO-s and return those
        }

        return null;
    }
}
