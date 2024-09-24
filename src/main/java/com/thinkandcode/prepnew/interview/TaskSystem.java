package com.thinkandcode.prepnew.interview;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class TaskSystem {

    static TaskStore taskStore = TaskStore.getInstance();
    static TaskFacade taskFacade = new TaskFacade(new TaskStore(), new AuditService(new AuditStore()));

    public static void main(String args[]){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Using today's date
        c.add(Calendar.DATE, 5); // Adding 5 days

        Task task = Task.
                builder().id(1)
                .tag("sept")
                .eta(c.getTime())
                .createdDate(new Date())
                .updatedDate(new Date())
                .text("Generate Prime number")
                .status(TaskStatus.NEW.toString())
                .createdBy(1)
                .build();

        c.add(Calendar.DATE, 6);
        Task task2 = Task.
                builder().id(2)
                .tag("sept")
                .eta(c.getTime())
                .createdDate(new Date())
                .updatedDate(new Date())
                .text("Generate Prime number 1")
                .status(TaskStatus.NEW.toString())
                .createdBy(1)
                .build();

        c.add(Calendar.DATE, 7);
        Task task3 = Task.
                builder().id(3)
                .tag("sept")
                .eta(new Date())
                .createdDate(new Date())
                .updatedDate(new Date())
                .text("Generate Prime number 2")
                .status(TaskStatus.NEW.toString())
                .createdBy(1)
                .build();

        taskFacade.addTask(TaskStatus.NEW.name(), task);
        taskFacade.addTask(TaskStatus.NEW.name(), task3);
        taskFacade.addTask(TaskStatus.NEW.name(), task2);
        Task gettask = taskFacade.getTask(2);
        System.out.println("Task ---> "+ gettask.toString());
        taskFacade.removeTask(task);
        //taskFacade.modifyTask(task);
        Task gettask1 = taskFacade.getTask(1);
        taskFacade.getAllTask();
        System.out.println("Task ---> "+ gettask1.toString());








    }
}
