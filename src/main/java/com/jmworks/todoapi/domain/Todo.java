package com.jmworks.todoapi.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String todoItem;
    private boolean isDone;

    @CreationTimestamp
    private LocalDateTime createdTimeAt;
    @UpdateTimestamp
    private LocalDateTime updateTimeAt;

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedTimeAt() {
        return createdTimeAt;
    }

    public void setCreatedTimeAt(LocalDateTime createdTimeAt) {
        this.createdTimeAt = createdTimeAt;
    }

    public LocalDateTime getUpdateTimeAt() {
        return updateTimeAt;
    }

    public void setUpdateTimeAt(LocalDateTime updateTimeAt) {
        this.updateTimeAt = updateTimeAt;
    }

    public String getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(String todoItem) {
        this.todoItem = todoItem;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}