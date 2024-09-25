package com.example.fanmon.domain.board.entity;

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
    @ManyToOne
    @JoinColumn(name="fanboarduuid")
    private Fanboard fanboarduuid;

//    @ManyToOne
//    @JoinColumn(name="useruuid")
//    private User user;

    private LocalDateTime postdate;
    private String content;
    private long ref;
    private long level;
    private long step;
}
