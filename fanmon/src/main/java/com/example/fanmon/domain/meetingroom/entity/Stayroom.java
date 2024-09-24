package com.example.fanmon.domain.meetingroom.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="stayroom")
@Data
public class Stayroom {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID stayuuid;
    private String name;
    private LocalDateTime createdat;
    /*
    @ManyToOne
    @JoinColumn(name="managementuuid")
    private Management managementuuid;
    */

    /*
    @ManyToOne
    @JoinColumn(name="artistuuid")
    private Artist artistuuid;
    */
}
