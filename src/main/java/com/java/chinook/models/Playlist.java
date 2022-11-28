package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Playlist")
public class Playlist {
    @Id
    int PlaylistId;
    String Name;

    public Playlist() {
    }

    public Playlist(int playlistId, String name) {
        PlaylistId = playlistId;
        Name = name;
    }

    public int getPlaylistId() {
        return PlaylistId;
    }

    public void setPlaylistId(int playlistId) {
        PlaylistId = playlistId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
