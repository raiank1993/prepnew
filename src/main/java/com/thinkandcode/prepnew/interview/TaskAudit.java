package com.thinkandcode.prepnew.interview;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskAudit {
    int id;
    int taskId;
    String requestType; // added, update, modify
    Date createdDate;
    Date updatedDate;


    @Override
    public String toString() {
        return "TaskAudit{" +
                "id=" + id +
                ", taskId=" + taskId +
                ", requestType='" + requestType + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
