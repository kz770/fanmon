package com.example.fanmon.domain.board.dao;

import com.example.fanmon.domain.board.entity.Artistboard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ArtisboardDAO extends JpaRepository<Artistboard, UUID> {
}
