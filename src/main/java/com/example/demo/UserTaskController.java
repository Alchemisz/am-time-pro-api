package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/userTasks")
public class UserTaskController {

    private final UserTaskRepository userTaskRepository;

    public UserTaskController(UserTaskRepository userTaskRepository) {
        this.userTaskRepository = userTaskRepository;
    }

    @GetMapping
    public List<UserTask> getAll(){
        return userTaskRepository.getYourTasks();
    }

    @PostMapping
    public UserTask add(@RequestBody UserTask userTask){
        userTask.setId(userTaskRepository.getYourTasks().size() + 1);
        userTaskRepository.add(userTask);
        return userTask;
    }

    @PutMapping
    public UserTask update(@RequestBody UserTask userTask){
        userTaskRepository.update(userTask);
        return userTask;
    }
}
