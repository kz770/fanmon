package com.example.fanmon.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="groupartistboard")
public class Groupartistboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fanboarduuid", updatable = false, nullable = false)
    private UUID groupartistboarduuid;

//    @OneToOne
//    @JoinColumn(name="groupuuid", nullable = false)
//    private Group groupuuid;

    @OneToOne
    @JoinColumn(name="artistboarduuid", nullable = false)
    private Artistboard artistboarduuid;
}
