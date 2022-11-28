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
            List<Album> albums = repository.findAllByOrderByAlbumIdAsc();
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
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/by-album-id/{albumId}")
    public ResponseEntity getAlbumById(@PathVariable Integer albumId) {
        try {
            if (albumId == null) {
                return getErrorResponse("albumId cannot be empty");
            }
            Optional<Album> album = repository.findByAlbumId(albumId);
            if (album.isPresent()) {
                List<HashMap<String, Object>> items = new ArrayList<>();
                HashMap<String, Object> item = new HashMap<>();
                item.put("albumId", album.get().getAlbumId());
                item.put("title", album.get().getTitle());
                item.put("artistId", album.get().getArtistId());
                items.add(item);
                return getSuccessResponse("", items);
            } else getNotFoundResponse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/by-artist-id/{artistId}")
    public ResponseEntity getAlbumByArtistId(@PathVariable Integer artistId) {
        try {
            if (artistId == null) {
                return getErrorResponse("artistId cannot be empty");
            }
            List<Album> foundAlbums = repository.findAll();
            List<Album> albums = new ArrayList<>();
            List<HashMap<String, Object>> items = new ArrayList<>();
            if (foundAlbums.size() > 0) {
                for (Album album : foundAlbums) {
                    if (album.getArtistId() == artistId) {
                        albums.add(album);
                    }
                }
            } else getNotFoundResponse();
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
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/by-title/{title}")
    public ResponseEntity getAlbumByTitle(@PathVariable String title) {
        try {
            if (title.isBlank()) {
                return getErrorResponse("Title cannot be empty");
            }
            List<Album> foundAlbums = repository.findAll();
            List<Album> albums = new ArrayList<>();
            List<HashMap<String, Object>> items = new ArrayList<>();
            if (foundAlbums.size() > 0) {
                for (Album album : foundAlbums) {
                    if (album.getTitle().toLowerCase().trim().contains(title.toLowerCase().trim())) {
                        albums.add(album);
                    }
                }
            } else getNotFoundResponse();
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
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
