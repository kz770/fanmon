package com.example.fanmon.goods.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goodsuuid", updatable = false, nullable = false)
    private UUID goodsuuid;

//    @ManyToOne
//    @JoinColumn(name="managementuuid", nullable = false)
//    private Management managementuuid;

    private String name;
    private long qty;
    private long price;
    private String fname;
}
