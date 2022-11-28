package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PlaylistTrack")
public class PlaylistTrack {
    @Id
    int playlistId;
    @Id
    int trackId;

    public PlaylistTrack() {
    }

    public PlaylistTrack(int playlistId, int trackId) {
        this.playlistId = playlistId;
        this.trackId = trackId;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }
}
