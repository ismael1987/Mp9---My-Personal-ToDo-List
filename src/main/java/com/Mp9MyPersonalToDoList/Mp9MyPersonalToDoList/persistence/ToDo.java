package com.Mp9MyPersonalToDoList.Mp9MyPersonalToDoList.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ToDo {
    @Id
    private String id;
    private String task;
    private boolean done;

    public ToDo( String task) {
        this.id = id;
        this.task = task;
        this.done = done;
    }
    public ToDo() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    @Override
    public String toString() {
        return "Applicant{" +
                "id='" + id + '\'' +
                ", task='" + task + '\'' +
                ", done='" + done + '\'' +

                '}';
    }
}
