package com.example.videogameswebapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Videogame")
@Table(name = "videogame")
@Data
public class Videogame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String mainLanguaje;
    private String webToDownload;
    private boolean subSpanish;
    private boolean isFinished;

}
