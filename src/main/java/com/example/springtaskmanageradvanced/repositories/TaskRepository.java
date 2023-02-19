package com.example.springtaskmanageradvanced.repositories;

import com.example.springtaskmanageradvanced.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {

    List<TaskEntity> findByCompleted(boolean completed);

    @Query("SELECT t FROM tasks t WHERE t.completed = false AND t.dueDate < CURRENT_DATE")
    List<TaskEntity> findAllOverdue();

    @Query("SELECT t FROM tasks t WHERE t.title LIKE %?1%")
    List<TaskEntity> findAllByTitle(String title);

    List<TaskEntity> findAllByCompletedAndDueDateBefore(boolean completed, Date dueDate);

    List<TaskEntity> findAllByTitleContainingIgnoreCase(String titleFragment);
}
