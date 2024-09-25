package com.example.fanmon.domain.board.dao;

import com.example.fanmon.domain.board.entity.Boardnotice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BoardnoticeDAO extends JpaRepository<Boardnotice, UUID> {
}
