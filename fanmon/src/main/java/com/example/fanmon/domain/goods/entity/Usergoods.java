package com.example.fanmon.domain.goods.entity;

import com.example.fanmon.domain.artist.entity.Group;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="usergoods")
public class Usergoods {

    @Id
    @Column(name = "usergoodsuuid", nullable = false)
    private UUID usergoodsuuid;

    @PrePersist
    public void generateUUID(){
        if(usergoodsuuid == null){
            usergoodsuuid = UUID.randomUUID();
        }
    }

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="useruuid")
//    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="goodsuuid")
    private Goods goods;

    private String cardinfo;
}