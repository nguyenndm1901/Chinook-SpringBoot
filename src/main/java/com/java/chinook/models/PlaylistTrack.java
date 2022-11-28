package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PlaylistTrack")
public class PlaylistTrack {
    int PlaylistId;
    int TrackId;

    public PlaylistTrack() {
    }

    public PlaylistTrack(int playlistId, int trackId) {
        PlaylistId = playlistId;
        TrackId = trackId;
    }

    public int getPlaylistId() {
        return PlaylistId;
    }

    public void setPlaylistId(int playlistId) {
        PlaylistId = playlistId;
    }

    public int getTrackId() {
        return TrackId;
    }

    public void setTrackId(int trackId) {
        TrackId = trackId;
    }
}
