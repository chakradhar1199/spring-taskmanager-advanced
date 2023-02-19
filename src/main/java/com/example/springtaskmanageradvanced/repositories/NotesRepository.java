package com.example.springtaskmanageradvanced.repositories;

import com.example.springtaskmanageradvanced.entities.NotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<NotesEntity, Long> {
}
