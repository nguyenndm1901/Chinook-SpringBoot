package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MediaType")
public class MediaType {
    @Id
    int MediaTypeId;
    String Name;

    public MediaType(int mediaTypeId, String name) {
        MediaTypeId = mediaTypeId;
        Name = name;
    }

    public MediaType() {
    }

    public int getMediaTypeId() {
        return MediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        MediaTypeId = mediaTypeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
