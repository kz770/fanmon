package com.example.fanmon.domain.fandomuser.entity;

import com.example.fanmon.domain.fandom.entity.Fandom;
import com.example.fanmon.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name="fandomuser")
@Data
public class FandomUser {
    @Id
    @Column(name="fandomuser", nullable = false)
    private UUID fandomuseruuid;

    @PrePersist
    public void generateUUID(){
        if(fandomuseruuid == null){
            fandomuseruuid = UUID.randomUUID();
        }
    }

    @ManyToOne
    @JoinColumn(name="useruuid")
    private User user;

    @ManyToOne
    @JoinColumn(name="fandomuuid")
    private Fandom fandom;

    @Column(name="username", nullable = false)
    private String username;

    //fandomname 은 fandom.name 으로 가져오게 하는걸로
}
