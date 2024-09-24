package com.example.fanmon.domain.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "groupartist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupArtist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "groupartistuuid", updatable = false, nullable = false)
    private String groupartistuuid;
    private String name;

    @ManyToOne
    @JoinColumn(name="managementuuid", insertable=true, updatable=true)
    private Management management;

    private LocalDateTime debut;
}
