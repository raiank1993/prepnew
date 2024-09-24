package com.thinkandcode.prepnew.interview;

public class TaskFacade {

    TaskStore taskStore;
    AuditService auditService;
    public TaskFacade(TaskStore taskStore,AuditService auditService){
        this.taskStore = taskStore;
        this.auditService = auditService;
    }

    void addTask(String taskType , Task task){
        //add Task
        taskStore.addTask(taskType, task);
        // create Audit
        auditService.addAudit(RequestType.Add.name(), task.getId());
    }

    public Task getTask(int taskId) {
        return taskStore.getTaskById(taskId);
    }

    public void modifyTask(Task task) {
        taskStore.modifyTask(TaskStatus.NEW.name(), task.getId());

        auditService.addAudit(RequestType.MODIFY.name(), task.getId());

    }

    public void removeTask(Task task) {
        taskStore.removeTask(TaskStatus.NEW.name(), task.getId());

        auditService.addAudit(RequestType.REMOVE.name(), task.getId());
    }

    public void getAllTask() {
        taskStore.getAllTask(TaskStatus.NEW.name());
    }
}
