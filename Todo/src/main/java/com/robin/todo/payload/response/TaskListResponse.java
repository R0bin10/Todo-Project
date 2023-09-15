package com.robin.todo.payload.response;

public class TaskListResponse {

    private long id;

    private long name;

    public TaskListResponse(){}

    public TaskListResponse(long id, long name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }
}
