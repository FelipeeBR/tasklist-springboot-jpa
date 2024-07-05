package com.todolist.task.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.todolist.task.entities.Task;
import com.todolist.task.repositories.TaskRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		date = dateFormat.parse("2024-06-26");
		Task t = new Task(null, date, "Formatar Notebook", "Fazer backup de todos arquivos importantes", false);
		
		taskRepository.saveAll(Arrays.asList(t));
	}
	
}
