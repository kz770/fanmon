package com.example.fanmon.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="boardnotice")
public class Boardnotice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "noticeuuid", updatable = false, nullable = false)
    private UUID noticeuuid;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fanboarduuid", updatable = false, nullable = false)
    private UUID fanboarduuid;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "managementuuid", updatable = false, nullable = false)
    private UUID managementuuid;

    private String title;
    private LocalDateTime postdate;
    private String content;

}
