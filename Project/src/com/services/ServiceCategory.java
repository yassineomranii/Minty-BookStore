/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;

/**
 *
 * @author ali
 */
public class ServiceCategory {
    private Connection cnx;
    
    public ServiceCategory(){
        cnx= MyConnection.getInstance().getConnection();
    }
    public void addCategory(Category c)throws SQLException{
        String request = "INSERT INTO 'Categories' ('id', 'name' )" 
                + " VALUES (NULL, '" +c.getName() +  "')" ;
        
    }
    
    public ArrayList<Category> getCategories() throws SQLException {
        A
    }
    
    
}
