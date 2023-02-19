package com.example.springtaskmanageradvanced.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity(name = "notes")
public class NotesEntity extends BaseEntity{

    @Column(name = "body", nullable = true, length = 500)
    private String body;

    @ManyToOne
    private TaskEntity taskEntity;
}
