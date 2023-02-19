package com.example.springtaskmanageradvanced.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity(name = "tasks")
@Table(indexes = @Index(columnList = "title"))
@Data
public class TaskEntity extends BaseEntity{


    @Column(name = "title", nullable = false, length = 255)
    private String title;
    private String description;

    private Boolean completed;

    @Column(name = "due_date")
    private Date dueDate;


}
