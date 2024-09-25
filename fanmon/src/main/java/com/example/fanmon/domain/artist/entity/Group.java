package com.example.fanmon.domain.artist.entity;

import com.example.fanmon.domain.management.entity.Management;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "group")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    @Id
    @Column(name = "groupuuid", nullable = false)
    private UUID groupuuid;

    @PrePersist
    public void generateUUID() {
        if (groupuuid == null) {
            groupuuid = UUID.randomUUID();
        }
    }

    private String name;

    @ManyToOne
    @JoinColumn(name="managementuuid", insertable=true, updatable=true)
    private Management management;

    private LocalDate debut;
}
