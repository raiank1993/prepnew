package com.thinkandcode.prepnew.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditStore {

    List<TaskAudit> taskMap;

    static AuditStore instance;

    AuditStore() {
        taskMap = new ArrayList<>();
    }

    public static AuditStore getInstance() {
        if (instance == null) {
            instance = new AuditStore();
        }
        return instance;
    }


    public void addAudit(TaskAudit audit) {
        taskMap.add(audit);
        System.out.println("added {}");
    }
}
