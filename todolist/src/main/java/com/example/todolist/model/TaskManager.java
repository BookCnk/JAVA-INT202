package com.example.todolist.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    @Getter
    private static List<Task> tasks = new ArrayList<>();

    public static boolean addTask(Task task) {
        if (task.getName().chars().allMatch(Character::isDigit)) {
            return false;
        }
        tasks.add(task);
        return true;
    }

    public static Task getTaskById(String id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

    public static boolean updateTask(String taskId, String updatedTaskName) {
        for (Task task : tasks) {
            if (task.getId().equals(taskId)) {
                task.setName(updatedTaskName);
                return true;
            }
        }
        return false;
    }

    public static boolean deleteTask(String id) {
        Task task = getTaskById(id);
        if (task != null) {
            tasks.remove(task);
            return true;
        }
        return false;
    }
}
