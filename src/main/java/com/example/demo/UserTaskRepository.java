package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserTaskRepository {
        private List<UserTask> yourTasks;
        public UserTaskRepository(List<UserTask> tasks) {
            this.yourTasks = tasks;
            tasks.add(new UserTask(1, "Spacer", 20, "Notatka", false));
            tasks.add(new UserTask(2, "Śniadanie", 15, "Notatka wersja 2", false));
        }

        public List<UserTask> getYourTasks(){
            Collections.sort(yourTasks);
            return yourTasks;
        }

        public void add(UserTask task){
            yourTasks.add(task);
        }

    public void update(UserTask userTask) {
        if (userTask.getId() != null){
            UserTask toRemo = yourTasks.stream().filter(e -> e.getId().equals(userTask.getId())).findFirst().get();
            yourTasks.remove(toRemo);
            yourTasks.add(userTask);
        }
    }
}
