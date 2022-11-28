package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Track")
public class Track {
    @Id
    int TrackId;
    String Name;
    int AlbumId;
    int MediaType;
    int GenreId;
    String Composer;
    int Milliseconds;
    int Bytes;
    double UnitPrice;

    public Track() {
    }

    public Track(int trackId, String name, int albumId, int mediaType, int genreId, String composer, int milliseconds, int bytes, double unitPrice) {
        TrackId = trackId;
        Name = name;
        AlbumId = albumId;
        MediaType = mediaType;
        GenreId = genreId;
        Composer = composer;
        Milliseconds = milliseconds;
        Bytes = bytes;
        UnitPrice = unitPrice;
    }

    public int getTrackId() {
        return TrackId;
    }

    public void setTrackId(int trackId) {
        TrackId = trackId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAlbumId() {
        return AlbumId;
    }

    public void setAlbumId(int albumId) {
        AlbumId = albumId;
    }

    public int getMediaType() {
        return MediaType;
    }

    public void setMediaType(int mediaType) {
        MediaType = mediaType;
    }

    public int getGenreId() {
        return GenreId;
    }

    public void setGenreId(int genreId) {
        GenreId = genreId;
    }

    public String getComposer() {
        return Composer;
    }

    public void setComposer(String composer) {
        Composer = composer;
    }

    public int getMilliseconds() {
        return Milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        Milliseconds = milliseconds;
    }

    public int getBytes() {
        return Bytes;
    }

    public void setBytes(int bytes) {
        Bytes = bytes;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }
}
