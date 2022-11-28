package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Playlist")
public class Playlist {
    @Id
    int playlistId;
    String name;

    public Playlist() {
    }

    public Playlist(int playlistId, String name) {
        this.playlistId = playlistId;
        this.name = name;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
