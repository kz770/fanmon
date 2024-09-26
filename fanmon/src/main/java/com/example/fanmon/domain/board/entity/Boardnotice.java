package com.example.fanmon.domain.board.entity;

import com.example.fanmon.domain.management.entity.Management;
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

    @ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    @JoinColumn(name="fanboarduuid", nullable = false)
    private Fanboard fanboard;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="managementuuid", nullable = false)
    private Management management;

    private String title;
    private LocalDateTime createdat;
    private String content;

}
