package com.example.fanmon.domain.chat.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name="subscribe")
public class Subscribe {
    @Id
    private UUID subscribeuuid;

    @PrePersist
    protected void onCreate() {
        if (subscribeuuid==null){
            this.subscribeuuid = UUID.randomUUID();
        }
    }

//    @ManyToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name="useruuid")
//    private User user;

//    @ManyToOne(cascade=CascadeType.REMOVE)
//    @JoinColumn(name="chatuuid")
//    private Chat chat;
}
