package com.example.fanmon.domain.meeting.entity;

import com.example.fanmon.domain.artist.entity.Artist;
import com.example.fanmon.domain.management.entity.Management;
import com.example.fanmon.domain.meeting.enums.MeetingroomStatus;
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
    private UUID stayuuid;

    @PrePersist
    public void generateUUID(){
        if(stayuuid == null){
            stayuuid = UUID.randomUUID();
        }
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDateTime createdat;

    private LocalDateTime meetingstartedat;

    @Enumerated(EnumType.STRING)
    private MeetingroomStatus status = MeetingroomStatus.ERROR_QUIT;

    @ManyToOne
    @JoinColumn(name="managementuuid")
    private Management management;

    @ManyToOne
    @JoinColumn(name="artistuuid")
    private Artist artist;

    private LocalDateTime meetingendedat;
}
