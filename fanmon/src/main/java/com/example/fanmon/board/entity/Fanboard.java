package com.example.fanmon.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="fanboard")
public class Fanboard {
    @Id
    private UUID fanboarduuid;
    private UUID artistuuid;
    private UUID useruuid;
    private UUID groupartistuuid;
    private String title;
    private LocalDateTime postdate;
    private String content;
    private long likecount;
}
