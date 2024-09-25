package com.example.fanmon.board.entity.dao;

import com.example.fanmon.board.entity.Artistboard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ArtisboardDAO extends JpaRepository<Artistboard, UUID> {
}
