package com.example.fanmon.domain.chat.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name="artistgroup")
public class ArtistGroup {
    @Id
    private UUID artistgroupuuid;
    @PrePersist
    protected void onCreate() {
        if (artistgroupuuid==null){
            this.artistgroupuuid = UUID.randomUUID();
        }
    }

//    @ManyToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name="groupartistname", updatable = true, nullable = false)
//    private Group group;


//    @ManyToOne
//    @JoinColumn(name="artistname", nullable = true)    //아티스트는 반드시 있어야함
//    private Artist aritst;

    private String name;
}
