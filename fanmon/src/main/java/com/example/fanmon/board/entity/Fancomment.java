package com.example.fanmon.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="fancomment")
public class Fancomment {
    @Id
    private UUID fancommentuuid;
    private UUID fanboarduuid;
    private UUID useruuid;
    private LocalDateTime postdate;
    private String content;
    private long ref;
    private long level;
    private long step;
}
