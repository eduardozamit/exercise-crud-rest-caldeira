package com.github.todoservice.service;

import com.github.todoservice.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {
    private static final Map<Integer, Task> tasks = new HashMap<>();

    // Adiciona um jogo a lista.
    public Task add(Task task) {
        int nextId = tasks.keySet().size() + 1;
        task.setId(nextId);
        tasks.put(nextId, task);
        return task;
    }

    //Atualiza uma tarefa.
    public Task edit (Task task, int taskId) {
        tasks.put(taskId, task);
        return task;
    }

    //  Buscar tarefa por id.
    public Task getById (int taskId) {
        return tasks.get(taskId);
    }

    // Retorna uma lista com todas as tarefas.
    public List<Task> getAll () {
        return new ArrayList<>(tasks.values());
    }

    // Deleta uma tarefa com base no id.
    public String delete (int taskId) {
        tasks.remove(taskId);
        return "DELETED";
    }
}
