package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("")
    public List<Task> getTasks(){
        return taskRepository.getTasks();
    }

    @PostMapping("")
    public Task add(@RequestBody Task task){
        task.setId(taskRepository.getTasks().size() + 1);
        taskRepository.add(task);
        return task;
    }

}
