package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    private List<Task> tasks;

    public TaskRepository(List<Task> tasks) {
        this.tasks = tasks;
        tasks.add(new Task(1, "Spacer", 20));
        tasks.add(new Task(2, "Śniadanie", 15));
        tasks.add(new Task(3, "Trening", 45));
        tasks.add(new Task(4, "Praca", 240));
        tasks.add(new Task(5, "Kolacja", 20));
    }

    public List<Task> getTasks(){
        return tasks;
    }

    public void add(Task task){
        tasks.add(task);
    }
}
