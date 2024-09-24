package com.example.fanmon.domain.meetingroom.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name="meetingroom")
@Data
public class Meetingroom {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID meetinguuid;

    /*
    @JoinColumns({
            @JoinColumn(name = "stayuuid"),
            @JoinColumn(name = "anotherColumn")
    })*/
    @ManyToOne
    @JoinColumn(name = "stayuuid")
    private Stayuserlist stayUserlist;

    /*
    @ManyToOne
    @JoinColumn(name="useruuid")
    private User user;
     */
}
