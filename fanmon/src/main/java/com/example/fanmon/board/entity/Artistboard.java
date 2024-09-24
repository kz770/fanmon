package com.example.fanmon.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="artistboard")
public class Artistboard {
    @Id
    private UUID artistboarduuid;
    private UUID groupartistuuid;
    private UUID artistuuid;
    private LocalDateTime postdate;
    private String content;
    private long likecount;
}
