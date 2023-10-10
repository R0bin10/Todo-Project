package com.robin.todo.mapper;

import com.robin.todo.models.Task;
import com.robin.todo.payload.request.TaskDto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class TaskMapperTest {

    @Test
    void taskDtoToTask() {
        TaskDto taskDto = new TaskDto("test", "desc");

        Task task = TaskMapper.INSTANCE.taskDtoToTask(taskDto);

        assertThat(task).isNotNull();
        assertThat(task.getName()).isEqualTo("test");
        assertThat(task.getDescription()).isEqualTo("desc");

    }
}