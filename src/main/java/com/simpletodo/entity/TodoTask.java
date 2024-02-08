package com.simpletodo.entity;

import java.util.Date;

public class TodoTask {
    private static int idCounter = 0;

    private int id = idCounter++;
    private String title;
    private String description;
    private TodoTaskStatus status = TodoTaskStatus.NOT_STARTED;
    private Date dueDate;
    private Date createdAt = Date.from(java.time.Instant.now());

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TodoTaskStatus getStatus() {
        return status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
