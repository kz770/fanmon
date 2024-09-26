package com.example.fanmon.domain.board.entity;

import com.example.fanmon.domain.artist.entity.Team;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name="fanboard")
public class Fanboard {
    @Id
    @Column(name = "fanboarduuid", nullable = false)
    private UUID fanboarduuid;

    @PrePersist
    public void generateUUID(){
        if(fanboarduuid == null){
            fanboarduuid = UUID.randomUUID();
        }
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="groupuuid")
    private Team team;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="useruuid")
//    private User user;

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Boardnotice> boardnotice;

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Fancomment> fanconmment;

    private String title;
    private LocalDateTime createdat;
    private String content;
    private long likecount;
}
