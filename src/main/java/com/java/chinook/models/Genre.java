package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Genre")
public class Genre {
    @Id
    int GenreId;
    String Name;

    public Genre() {
    }

    public Genre(int genreId, String name) {
        GenreId = genreId;
        Name = name;
    }

    public int getGenreId() {
        return GenreId;
    }

    public void setGenreId(int genreId) {
        GenreId = genreId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
