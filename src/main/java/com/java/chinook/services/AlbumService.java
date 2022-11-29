package com.java.chinook.services;

import com.java.chinook.models.Album;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/api/v1/album")
public class AlbumService extends ServiceBase {

    @GetMapping("/albums")
    public ResponseEntity getAllAlbums() {
        try {
            List<Album> albums = albumRepository.findAllByOrderByAlbumIdAsc();
            List<HashMap<String, Object>> items = new ArrayList<>();
            if (null != albums && albums.size() > 0) {
                for (Album album : albums) {
                    HashMap<String, Object> item = new HashMap<>();
                    item.put("albumId", album.getAlbumId());
                    item.put("title", album.getTitle());
                    item.put("artistId", album.getArtistId());
                    items.add(item);
                }
            }
            return getSuccessResponse("", items);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/by-album-id/{id}")
    public ResponseEntity getAlbumById(@PathVariable String id) {
        try {
            if (id.isBlank()) {
                return getErrorResponse("albumId cannot be empty");
            }
            if (!isInteger(id)) return getErrorResponse("albumId must be Integer");
            else {
                int albumId = Integer.parseInt(id);
                Optional<Album> album = albumRepository.findByAlbumId(albumId);
                if (album.isPresent()) {
                    List<HashMap<String, Object>> items = new ArrayList<>();
                    HashMap<String, Object> item = new HashMap<>();
                    item.put("albumId", album.get().getAlbumId());
                    item.put("title", album.get().getTitle());
                    item.put("artistId", album.get().getArtistId());
                    items.add(item);
                    return getSuccessResponse("", items);
                } else return getNotFoundResponse();
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/by-artist-id/{id}")
    public ResponseEntity getAlbumByArtistId(@PathVariable String id) {
        try {
            if (id.isBlank()) return getErrorResponse("artistId cannot be empty");
            if (!isInteger(id)) return getErrorResponse("artistId must be Integer");
            int artistId = Integer.parseInt(id);
            List<Album> foundAlbums = albumRepository.findAll();
            List<Album> albums = new ArrayList<>();
            List<HashMap<String, Object>> items = new ArrayList<>();
            if (foundAlbums.size() > 0) {
                for (Album album : foundAlbums) {
                    if (album.getArtistId() == artistId)
                        albums.add(album);
                }
            } else return getNotFoundResponse();
            if (albums.size() > 0) {
                for (Album album : albums) {
                    HashMap<String, Object> item = new HashMap<>();
                    item.put("albumId", album.getAlbumId());
                    item.put("title", album.getTitle());
                    item.put("artistId", album.getArtistId());
                    items.add(item);
                }
            }
            return getSuccessResponse("", items);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/by-title/{title}")
    public ResponseEntity getAlbumByTitle(@PathVariable String title) {
        try {
            if (title.isBlank()) {
                return getErrorResponse("Title cannot be empty");
            }
            List<Album> foundAlbums = albumRepository.findAll();
            List<Album> albums = new ArrayList<>();
            List<HashMap<String, Object>> items = new ArrayList<>();
            if (foundAlbums.size() > 0) {
                for (Album album : foundAlbums) {
                    if (album.getTitle().toLowerCase().trim().contains(title.toLowerCase().trim())) {
                        albums.add(album);
                    }
                }
            } else return getNotFoundResponse();
            if (albums.size() > 0) {
                for (Album album : albums) {
                    HashMap<String, Object> item = new HashMap<>();
                    item.put("albumId", album.getAlbumId());
                    item.put("title", album.getTitle());
                    item.put("artistId", album.getArtistId());
                    items.add(item);
                }
            }
            return getSuccessResponse("", items);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
