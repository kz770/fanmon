package com.example.fanmon.domain.meetingroom.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="stayuserlist")
@Data
public class Stayuserlist {
    @Id
    @ManyToOne
    @JoinColumn(name="stayuuid")
    private Stayroom stayroom;
    /*
    @Id
    @ManyToOne
    @JoinColumn(name="useruuid")
    private User useruuid;
    */
    private int no;
}
