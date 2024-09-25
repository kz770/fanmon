package com.example.fanmon.domain.chat.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name="chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID chatuuid;

//    @OneToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name="artistuuid", updatable = true, nullable = true)
//    private Artist artist;

    private Long price;
}
