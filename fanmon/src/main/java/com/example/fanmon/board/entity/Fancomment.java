package com.example.fanmon.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="fancomment")
public class Fancomment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fancommentuuid", updatable = false, nullable = false)
    private UUID fancommentuuid;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fanboarduuid", updatable = false, nullable = false)
    private UUID fanboarduuid;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "useruuid", updatable = false, nullable = false)
    private UUID useruuid;

    private LocalDateTime postdate;
    private String content;
    private long ref;
    private long level;
    private long step;
}
