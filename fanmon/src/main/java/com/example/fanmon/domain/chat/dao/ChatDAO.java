package com.example.fanmon.domain.chat.dao;

import com.example.fanmon.domain.chat.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ChatDAO extends JpaRepository<Chat, UUID> {

}
