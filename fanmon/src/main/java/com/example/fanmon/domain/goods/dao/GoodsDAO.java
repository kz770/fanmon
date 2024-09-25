package com.example.fanmon.domain.goods.dao;

import com.example.fanmon.domain.goods.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GoodsDAO extends JpaRepository<Goods, UUID> {
}
