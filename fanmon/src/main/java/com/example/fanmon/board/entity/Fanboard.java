package com.example.fanmon.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="fanboard")
public class Fanboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fanboarduuid", updatable = false, nullable = false)
    private UUID fanboarduuid;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "artistuuid", updatable = false, nullable = false)
    private UUID artistuuid;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "useruuid", updatable = false, nullable = false)
    private UUID useruuid;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "groupartistuuid", updatable = false, nullable = false)
    private UUID groupartistuuid;

    private String title;
    private LocalDateTime postdate;
    private String content;
    private long likecount;
}
