package com.java.chinook.controllers;

import com.java.chinook.models.Album;
import com.java.chinook.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/albums")
public class AlbumController {
    @Autowired
    private AlbumRepository repository;

    @GetMapping()
    List<Album> getAllAlbums() {
        return repository.findAll();
    }
}
