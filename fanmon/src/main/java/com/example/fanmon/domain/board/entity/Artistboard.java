package com.example.fanmon.domain.board.entity;

import com.example.fanmon.domain.artist.entity.Team;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="artistboard")
public class Artistboard {
    @Id
    @Column(name = "artistboarduuid", nullable = false)
    private UUID artistboarduuid;

    @PrePersist
    public void generateUUID(){
        if(artistboarduuid == null){
            artistboarduuid = UUID.randomUUID();
        }
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="groupuuid")
    private Team team;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="artistuuid", nullable = false)
//    private Artist artist;

    private LocalDateTime createdat;
    private String content;
    private long likecount;
}
