package com.example.fanmon.domain.goods.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="goods")
public class Goods {

    @Id
    @Column(name = "goodsuuid", nullable = false)
    private UUID goodsuuid;

    @PrePersist
    public void generateUUID(){
        if(goodsuuid == null){
            goodsuuid = UUID.randomUUID();
        }
    }

//    @ManyToOne
//    @JoinColumn(name="managementuuid", nullable = false)
//    private Management management;

    private String category;
    private String name;
    private long qty;
    private long price;
    private String fname;
}
