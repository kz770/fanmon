package com.example.fanmon.domain.goods.entity;

import com.example.fanmon.domain.artist.entity.Group;
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

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="managementuuid", nullable = false)
//    private Management management;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="groupuuid")
    private Group group;

    private String name;
    private long qty;
    private long price;
    private String fname;
}
