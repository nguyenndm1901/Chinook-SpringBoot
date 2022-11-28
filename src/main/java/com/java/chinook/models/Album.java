package com.java.chinook.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Album")
public class Album {
    @Id
    @Column(name="AlbumId")
    int AlbumId;
    String Title;
    String ArtistId;

    public Album() {}

    public Album(int albumId, String title, String artistId) {
        AlbumId = albumId;
        Title = title;
        ArtistId = artistId;
    }

    public int getAlbumId() {
        return AlbumId;
    }

    public void setAlbumId(int albumId) {
        AlbumId = albumId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getArtistId() {
        return ArtistId;
    }

    public void setArtistId(String artistId) {
        ArtistId = artistId;
    }
}
