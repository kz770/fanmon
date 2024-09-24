package com.example.fanmon.board.entity;

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

//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "groupartistuuid", updatable = false, nullable = false)
//    @OneToOne
//    @JoinColumn(name="groupartistuuid", nullable = false)
//    private Groupartist groupartistuuid;

//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "artistuuid", updatable = false, nullable = false)
//    @OneToMany(mappedBy = "artistboard")
//    private List<Artist> artistuuid;

    private LocalDateTime postdate;
    private String content;
    private long likecount;
}
