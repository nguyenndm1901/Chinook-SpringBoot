package com.java.chinook.interfaces;

import com.java.chinook.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Optional<Album> findByAlbumId(int Id);

    List<Album> findAllByOrderByAlbumIdAsc();
}
