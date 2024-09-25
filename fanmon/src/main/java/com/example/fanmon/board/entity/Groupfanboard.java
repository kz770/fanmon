package com.example.fanmon.board.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="groupfanboard")
public class Groupfanboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fanboarduuid", updatable = false, nullable = false)
    private UUID groupfanboarduuid;

//    @OneToOne
//    @JoinColumn(name="groupuuid", nullable = false)
//    private Group groupuuid;

    @OneToOne
    @JoinColumn(name="fanboarduuid", nullable = false)
    private Fanboard fanboarduuid;

}
