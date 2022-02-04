package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

@Getter
@Setter
public class UserTask extends Task implements Comparable<UserTask> {

    private String note;
    private boolean status;

    public UserTask(Integer id, String value, Integer time, String note, boolean status) {
        super(id, value, time);
        this.note = note;
        this.status = status;
    }

    @Override
    public int compareTo(UserTask o) {
        return this.getId().compareTo(o.getId());
    }
}
