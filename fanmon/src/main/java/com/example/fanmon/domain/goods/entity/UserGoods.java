package com.example.fanmon.domain.goods.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="usergoods")
public class UserGoods {

    @Id
    @Column(name = "usergoodsuuid", nullable = false)
    private UUID usergoodsuuid;

    @PrePersist
    public void generateUUID(){
        if(usergoodsuuid == null){
            usergoodsuuid = UUID.randomUUID();
        }
    }

//    @ManyToOne
//    @JoinColumn(name="useruuid")
//    private User user;

    @ManyToOne
    @JoinColumn(name="goodsuuid")
    private Goods goods;

    private String cardinfo;
}