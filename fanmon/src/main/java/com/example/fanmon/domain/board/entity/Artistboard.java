package com.example.fanmon.domain.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="artistboard")
public class Artistboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "artistboarduuid", updatable = false, nullable = false)
    private UUID artistboarduuid;

//    수정!
//    @ManyToOne
//    @JoinColumn(name="artistuuid", nullable = false)
//    private Artist artist=;

    private LocalDateTime postdate;
    private String content;
    private long likecount;
}
