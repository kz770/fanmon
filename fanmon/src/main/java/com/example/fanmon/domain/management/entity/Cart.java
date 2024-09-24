package com.example.fanmon.domain.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "cart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartsequence", updatable = false, nullable = false)
    private Long crtsequence;
/*    @ManyToOne
    @JoinColumn(name = "useruuid", referencedColumnName = "useruuid", insertable = true, updatable = true)
    private User user;

    @ManyToOne
    @JoinColumn(name = "goodsuuid", referencedColumnName = "goodsuuid", insertable = true, updatable = true)
    private Goods goods;*/
    private LocalDateTime createdat;

}
