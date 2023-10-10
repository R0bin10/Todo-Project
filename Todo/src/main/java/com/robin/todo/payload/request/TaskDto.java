package com.robin.todo.payload.request;

public class TaskDto {

    private String name;
    private String description;

    public TaskDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public TaskDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
