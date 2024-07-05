package com.todolist.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.task.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
