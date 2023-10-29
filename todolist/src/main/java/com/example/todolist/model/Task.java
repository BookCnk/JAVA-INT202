package com.example.todolist.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private String id;
    private String name;

    public Task(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
