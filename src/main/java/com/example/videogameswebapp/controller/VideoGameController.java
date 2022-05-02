package com.example.videogameswebapp.controller;

import com.example.videogameswebapp.entity.Videogame;
import com.example.videogameswebapp.service.VideogameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")
public class VideoGameController {

    @Autowired
    private VideogameService service;

    @GetMapping("get/games")
    public List<Videogame> getAllGames(){
        return service.getAllGames();
    }

    @PostMapping("save/game")
    public Videogame saveGame(@RequestBody Videogame videogame){
        return service.saveGame(videogame);
    }

    @PutMapping("update/game")
    public Videogame updateGame(@RequestBody Videogame videogame){
        return service.update(videogame);
    }

    @DeleteMapping("delete/game/{id}")
    public void deleteGame(@PathVariable Long id){
        service.deleteGame(id);
    }
}
