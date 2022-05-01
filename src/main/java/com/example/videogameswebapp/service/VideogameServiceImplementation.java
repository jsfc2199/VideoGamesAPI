package com.example.videogameswebapp.service;

import com.example.videogameswebapp.entity.Videogame;
import com.example.videogameswebapp.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideogameServiceImplementation implements VideogameService{

    @Autowired
    private VideogameRepository gameRepository;

    @Override
    public List<Videogame> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Videogame saveGame(Videogame videogame) {
        return gameRepository.save(videogame);
    }

    @Override
    public Videogame update(Videogame videogame) {
        boolean isVideoGameInDatabase = gameRepository.existsById(videogame.getId());
        if(isVideoGameInDatabase){
            return gameRepository.save(videogame);
        }
        return null;
    }

    @Override
    public void deleteGame(Long id) {
        boolean videoGameToDelete = gameRepository.existsById(id);
        if(videoGameToDelete){
            gameRepository.getById(id);
        }
    }
}
