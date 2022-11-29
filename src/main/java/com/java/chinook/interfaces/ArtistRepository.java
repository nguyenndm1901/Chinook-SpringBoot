package com.java.chinook.interfaces;

import com.java.chinook.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    Optional<Artist> findByArtistId(int artistId);
    List<Artist> findAllByOrderByArtistIdAsc();
}
