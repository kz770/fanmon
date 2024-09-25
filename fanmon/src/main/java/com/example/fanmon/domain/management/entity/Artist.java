package com.example.fanmon.domain.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "artist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "artistuuid", updatable = false, nullable = false)
    private UUID artistuuid;
    private String name;

    @ManyToOne
    @JoinColumn(name="managementuuid", insertable=true, updatable=true)
    private Management management;

    private String type;
    private LocalDateTime debut;
    private String email;
    private String password;
}
