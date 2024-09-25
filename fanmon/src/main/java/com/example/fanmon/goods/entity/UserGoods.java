package com.example.fanmon.goods.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="usergoods")
public class UserGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usergoodsuuid", updatable = false, nullable = false)
    private UUID usergoodsuuid;

//    @ManyToOne
//    @JoinColumn(name="useruuid")
//    private User useruuid;

    @ManyToOne
    @JoinColumn(name="goodsuuid")
    private Goods goodsuuid;

    private String cardinfo;
}