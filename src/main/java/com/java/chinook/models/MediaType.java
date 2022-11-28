package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MediaType")
public class MediaType {
    @Id
    int mediaTypeId;
    String name;

    public MediaType() {
    }

    public MediaType(int mediaTypeId, String name) {
        this.mediaTypeId = mediaTypeId;
        this.name = name;
    }

    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
