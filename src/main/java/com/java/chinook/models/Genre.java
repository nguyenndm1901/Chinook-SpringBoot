package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Genre")
public class Genre {
    @Id
    int genreId;
    String name;

    public Genre() {
    }

    public Genre(int genreId, String name) {
        this.genreId = genreId;
        this.name = name;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
