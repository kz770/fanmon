package com.example.fanmon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name="dm")
public class DM {
    @Id
    private UUID uuid;
}
