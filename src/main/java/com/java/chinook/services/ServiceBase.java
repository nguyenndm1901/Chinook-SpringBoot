package com.java.chinook.services;

import com.java.chinook.interfaces.AlbumRepository;
import com.java.chinook.interfaces.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.core.Response;
import java.util.HashMap;

public abstract class ServiceBase {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    ArtistRepository artistRepository;

    protected static ResponseEntity<Object> getSuccessResponse(String message, Object data) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            map.put("status", 1);
            if (!message.isBlank()) map.put("message", message);
            if (null != data) map.put("data", data);
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    protected static ResponseEntity<Object> getSuccessResponse(String message) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            map.put("status", 1);
            if (!message.isBlank()) map.put("message", message);
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    protected static ResponseEntity<Object> getErrorResponse(String message, Object data) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            map.put("status", 1);
            if (!message.isBlank()) map.put("message", message);
            if (null != data) map.put("data", data);
            return new ResponseEntity<>(map, HttpStatus.NOT_IMPLEMENTED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    protected static ResponseEntity<Object> getErrorResponse(String message) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            map.put("status", 1);
            if (!message.isBlank()) map.put("message", message);
            return new ResponseEntity<>(map, HttpStatus.NOT_IMPLEMENTED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    protected static ResponseEntity<Object> getNotFoundResponse() {
        HashMap<String, Object> map = new HashMap<>();
        try {
            map.put("status", 1);
            map.put("message", "No result found");
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            map.put("status", 0);
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    protected static boolean isInteger(String number) {
        try {
            Integer.parseInt(number);
        } catch(NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
