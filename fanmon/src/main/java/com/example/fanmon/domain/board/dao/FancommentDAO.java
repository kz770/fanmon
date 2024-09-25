package com.example.fanmon.domain.board.dao;

import com.example.fanmon.domain.board.entity.Fancomment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FancommentDAO extends JpaRepository<Fancomment, UUID> {
}
