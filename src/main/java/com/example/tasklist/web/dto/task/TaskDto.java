package com.example.tasklist.web.dto.task;

import com.example.tasklist.domain.task.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDto {

    private Long id;
    private String title;
    private String description;
    private Status status;
    //час коли ця задача повинна бути виконаною
    private LocalDateTime expirationDate;
}
