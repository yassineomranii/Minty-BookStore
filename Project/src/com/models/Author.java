/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author ASUS
 */
public class Author {
    private int id ;
    private String name ;
    private String description;
    private String PloUrl;

    public Author(int id, String name, String description, String PloUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.PloUrl = PloUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPloUrl(String PloUrl) {
        this.PloUrl = PloUrl;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPloUrl() {
        return PloUrl;
    }
    
    
}
