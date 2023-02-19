package com.example.springtaskmanageradvanced.repositories;

import com.example.springtaskmanageradvanced.entities.TaskEntity;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class TasktestRepo {
    @Autowired
    TaskRepository taskRepository;

    @Test
    public void testCreateTest(){
        TaskEntity task = new TaskEntity();
        task.setCompleted(false);
        task.setDescription("TEst Description");
        task.setTitle("Test Title");
        taskRepository.save(task);
        var tasks = taskRepository.findAll();
        assertEquals(1, tasks.size());
    }

    @Test
    public void findByCompleted(){
        TaskEntity task = new TaskEntity();
        task.setCompleted(false);
        task.setDescription("TEst Description");
        task.setTitle("Test Title");
        taskRepository.save(task);
        var tasks = taskRepository.findAll();
        assertEquals(0, tasks.size());
    }
}
