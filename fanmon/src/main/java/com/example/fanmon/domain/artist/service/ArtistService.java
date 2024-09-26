package com.example.fanmon.domain.artist.service;

import com.example.fanmon.domain.artist.dao.ArtistDAO;
import com.example.fanmon.domain.artist.entity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    @Autowired
    private ArtistDAO dao;

    public List<Artist> findAll(){
        return dao.findAll();
    }
}
