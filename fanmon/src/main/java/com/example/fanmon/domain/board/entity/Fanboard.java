package com.example.fanmon.domain.board.entity;

import com.example.fanmon.domain.artist.entity.Group;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
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
    private Group group;

//    @ManyToOne
//    @JoinColumn(name="useruuid")
//    private User user;

    private String title;
    private LocalDateTime createdat;
    private String content;
    private long likecount;
}
