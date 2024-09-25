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
    @Column(name = "noticeuuid", nullable = false)
    private UUID noticeuuid;

    @PrePersist
    public void generateUUID(){
        if(noticeuuid == null){
            noticeuuid = UUID.randomUUID();
        }
    }

    @ManyToOne
    @JoinColumn(name="fanboarduuid")
    private Fanboard fanboarduuid;

//    @ManyToOne
//    @JoinColumn(name="managementuuid")
//    private Management management;

    private String title;
    private LocalDateTime createdat;
    private String content;

}
