package com.thinkandcode.prepnew.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskStore {

    Map<String , List<Task>> taskMap;

    static TaskStore instance;

    TaskStore() {
        taskMap = new HashMap<>();
    }

    public static TaskStore getInstance() {
        if (instance == null) {
            instance = new TaskStore();
        }
        return instance;
    }

    public List<Task> getAllTask(String taskType) {
        return instance.taskMap.get(taskType);
    }

    public void addTask(String taskType, Task task) {
        if(instance.taskMap.get(taskType) != null){
            List<Task> taskList = instance.taskMap.get(taskType);
            taskList.add(task);
            instance.taskMap.put(taskType, taskList);
        }
        else{
            List<Task> list = new ArrayList<>();
            list.add(task);
            instance.taskMap.put( taskType, list);
        }
        List<Task> taskList = instance.taskMap.get(taskType);
        for(Task t : taskList){
            System.out.println("added {}"+ t.toString());
        }

    }

    public void removeTask(String taskType, int taskId) {
        if(instance.taskMap.get(taskType) != null) {
            List<Task> taskList = instance.taskMap.get(taskType);
            List<Task> removetask = taskList.stream().filter(task -> task.getId() == taskId).toList();
            taskList.remove(removetask.get(0));
            instance.taskMap.put(taskType, taskList);
        }
        System.out.println("removed {}"+ instance.taskMap.get(taskType).size());
    }

    public void modifyTask(String taskType, int taskId) {
        if(instance.taskMap.get(taskType) != null) {
            List<Task> taskList = instance.taskMap.get(taskType);
            List<Task> tasks = taskList.stream().filter(task -> task.getId() == taskId).toList();
            Task taskTobeModify = tasks.get(0);
            taskList.remove(taskTobeModify);
            taskTobeModify.setStatus(TaskStatus.COMPLETED.name());
            addTask(TaskStatus.COMPLETED.name(), taskTobeModify);
            instance.taskMap.put(taskType, taskList);
        }
        System.out.println("removed {}"+ instance.taskMap.get(taskType).size());
    }

    public Task getTaskById(int taskId) {
        if(instance.taskMap.get(TaskStatus.NEW.name()) != null){
            List<Task> taskList = instance.taskMap.get(TaskStatus.NEW.name());
            List<Task> tasks = taskList.stream().filter(task -> task.getId() == taskId).toList();
            return !tasks.isEmpty() ? tasks.get(0) : new Task();
        }
        return null;
    }
}
