package com.example.videogameswebapp.repository;


import com.example.videogameswebapp.entity.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}
