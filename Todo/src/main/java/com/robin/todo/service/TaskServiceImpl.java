package com.robin.todo.service;

import com.robin.todo.mapper.TaskMapper;
import com.robin.todo.models.Task;
import com.robin.todo.models.User;
import com.robin.todo.payload.request.TaskDTO;
import com.robin.todo.payload.response.TaskListResponse;
import com.robin.todo.repository.TaskRepository;
import com.robin.todo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<TaskListResponse> getTasksByUserName(String username) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return TaskMapper.INSTANCE.taskListToDto(user.getTasks());
        }
        return new ArrayList<>();
    }

    @Override
    public void addNewTaskToUser(String username, TaskDTO taskDTO) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            Task newTask = TaskMapper.INSTANCE.taskDtoToTask(taskDTO);
            user.addTask(newTask);
            userRepository.save(user);
        }
    }
}
