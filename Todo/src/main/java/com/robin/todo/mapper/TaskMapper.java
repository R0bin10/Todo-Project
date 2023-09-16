package com.robin.todo.mapper;

import com.robin.todo.models.Task;
import com.robin.todo.payload.response.TaskListResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TaskMapper {

    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    List<TaskListResponse> taskListToDto(List<Task> taskList);
}
