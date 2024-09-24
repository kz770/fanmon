package com.example.fanmon.goods.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="goods")
public class goods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goodsuuid", updatable = false, nullable = false)
    private UUID goodsuuid;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "managementuuid", updatable = false, nullable = false)
    private UUID managementuuid;

    private String name;
    private long qty;
    private long price;
    private String fname;
}
