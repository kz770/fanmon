package com.example.fanmon.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name="boardnotice")
public class Boardnotice {

    @Id
    private UUID noticeuuid;
    private String title;
    private LocalDateTime postdate;
    private String content;
    private UUID fanboarduuid;
    private UUID managementuuid;
}
