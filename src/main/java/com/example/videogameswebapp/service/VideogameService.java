package com.example.videogameswebapp.service;

import com.example.videogameswebapp.entity.Videogame;

import java.util.List;

public interface VideogameService {
    List<Videogame> getAllGames();
    Videogame saveGame(Videogame videogame);
    Videogame update(Videogame videogame);
    void deleteGame(Long id);
}
