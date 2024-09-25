package com.example.fanmon.domain.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "group")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "groupuuid", updatable = false, nullable = false)
    private String groupuuid;
    private String name;

    @ManyToOne
    @JoinColumn(name="managementuuid", insertable=true, updatable=true)
    private Management management;

    private LocalDateTime debut;
}
