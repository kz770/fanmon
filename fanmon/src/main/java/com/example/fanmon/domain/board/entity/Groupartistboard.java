package com.example.fanmon.domain.board.entity;

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
//    private Group group;

    @OneToOne
    @JoinColumn(name="artistboarduuid", nullable = false)
    private Artistboard artistboard;
}
