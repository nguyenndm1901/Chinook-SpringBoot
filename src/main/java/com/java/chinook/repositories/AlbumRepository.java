package com.java.chinook.repositories;

import com.java.chinook.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Optional<Album> findById(int Id);

    List<Album> findAllByOrderByAlbumIdAsc();
}
