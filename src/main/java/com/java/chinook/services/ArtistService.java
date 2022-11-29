package com.java.chinook.services;

import com.java.chinook.models.Album;
import com.java.chinook.models.Artist;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/artist")
public class ArtistService extends ServiceBase {

    @GetMapping("/artists")
    public ResponseEntity getAllArtists() {
        try {
            List<Artist> artists = artistRepository.findAllByOrderByArtistIdAsc();
            List<HashMap<String, Object>> items = new ArrayList<>();
            if (null != artists && artists.size() > 0) {
                for (Artist artist : artists) {
                    HashMap<String, Object> item = new HashMap<>();
                    item.put("artistId", artist.getArtistId());
                    item.put("name", artist.getName());
                    items.add(item);
                }
            }
            return getSuccessResponse("", items);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/by-artist-id/{id}")
    public ResponseEntity getArtistById(@PathVariable String id) {
        try {
            if (id.isBlank()) return getErrorResponse("artistId cannot be empty");
            if (!isInteger(id)) return getErrorResponse("artistId must be Integer");
            int artistId = Integer.parseInt(id);
            Optional<Artist> artist = artistRepository.findByArtistId(artistId);
            if (artist.isPresent()) {
                List<HashMap<String, Object>> items = new ArrayList<>();
                HashMap<String, Object> item = new HashMap<>();
                item.put("artistId", artist.get().getArtistId());
                item.put("name", artist.get().getName());
                items.add(item);
                return getSuccessResponse("", items);
            } else return getNotFoundResponse();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/by-artist-name/{name}")
    public ResponseEntity getArtistByName(@PathVariable String name) {
        try {
            if (name.isBlank()) return getErrorResponse("Artist name cannot be empty");
            List<Artist> foundArtists = artistRepository.findAll();
            List<Artist> artists = new ArrayList<>();
            List<HashMap<String, Object>> items = new ArrayList<>();
            if (foundArtists.size() > 0) {
                for (Artist artist : foundArtists) {
                    if (artist.getName().toLowerCase().trim().contains(
                            name.toLowerCase().trim())) {
                        artists.add(artist);
                    }
                }
            }
            if (artists.size() == 0) return getNotFoundResponse();
            else {
                for (Artist artist : artists) {
                    HashMap<String, Object> item = new HashMap<>();
                    item.put("artistId", artist.getArtistId());
                    item.put("name", artist.getName());
                    items.add(item);
                }
            }
            return getSuccessResponse("", items);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
