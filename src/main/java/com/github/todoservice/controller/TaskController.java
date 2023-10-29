package com.github.todoservice.controller;

import com.github.todoservice.model.Task;
import com.github.todoservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskController {
    @Autowired
    private TaskService taskService;

    // Lista todas as tarefas.
    @GetMapping
    @ResponseBody
    public List<Task> getAll() {
        return taskService.getAll();
    }

    // Adiciona uma nova tarefa.
    @PostMapping
    @ResponseBody
    public Task add(@RequestBody Task task) {
        return taskService.add(task);
    }

    // Altera uma tarefa pelo id.
    @PutMapping("/{taskId}")
    @ResponseBody
    public Task edit(@PathVariable("taskId") int taskId,
                     @RequestBody Task task) {
        return taskService.edit(task, taskId);
    }

    // Deleta uma tarefa pelo id.
    @DeleteMapping("/{taskId}")
    @ResponseBody
    public String delete(@PathVariable("taskId") int taskId) {
        return taskService.delete(taskId);
    }
}
