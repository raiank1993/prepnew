package com.thinkandcode.prepnew.interview;

import lombok.*;

import java.util.Date;


@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    int id;
    String text;
    String tag;
    Date createdDate;
    Date updatedDate;
    String status;
    Date eta;
    int createdBy;
    int updatedBy;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", tag='" + tag + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", status='" + status + '\'' +
                ", eta=" + eta +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                '}';
    }
}
