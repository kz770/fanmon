package com.example.fanmon.goods;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="goods")
public class goods {

    @Id
    private UUID goodsuuid;
    private UUID managementuuid;
    private String name;
    private long qty;
    private long price;
    private String fname;
}
