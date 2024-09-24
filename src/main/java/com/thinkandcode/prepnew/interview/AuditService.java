package com.thinkandcode.prepnew.interview;

import java.util.Date;

public class AuditService {

    AuditStore auditStore;

    public AuditService(AuditStore auditStore){
        this.auditStore = auditStore;
    }

    public void addAudit(String requestType, int id) {
        TaskAudit tA = TaskAudit.builder()
                .taskId(id)
                .createdDate(new Date())
                .updatedDate(new Date())
                .requestType(requestType)
                .id(1)
                .build();
        this.auditStore.addAudit(tA);
    }
}
