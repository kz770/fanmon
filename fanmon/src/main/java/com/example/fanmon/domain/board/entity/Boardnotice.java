package com.example.fanmon.domain.board.entity;

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
    @ManyToOne
    @JoinColumn(name="fanboarduuid")
    private Fanboard fanboarduuid;

//    @ManyToOne
//    @JoinColumn(name="managementuuid")
//    private Management management;

    private String title;
    private LocalDateTime postdate;
    private String content;

}
