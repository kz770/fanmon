package com.example.fanmon.goods;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="usergoods")
public class UserGoods {

    @Id
    private UUID usergoodsuuid;
    private UUID useruuid;
    private UUID goodsuuid;
    private String cardinfo;
}