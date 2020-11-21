/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgMinty.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pkgMinty.entities.Book;
import pkgMinty.entities.User;
import pkgMinty.utils.MyConnection;

/**
 *
 * @author MediaStudio
 */
public class ServiceBook {
    private Connection cnx;
    public ServiceBook() {
        cnx = MyConnection.getInstance().getConnection();
    }
    public void addBook(Book b) throws SQLException {
        
        String request = "INSERT INTO `books`(`id`, `title`, `description`, `idCategory`, `idAuthor`, `idLanguage`, `imageUrl`, `prix`, `rating`, `nbrPages`, `publishDate`, `quantity`)"
                + " VALUES (NULL, '" + b.getTitle()  +"', '"+ b.getDescription() +"', '"+b.getIdCategory()+"', '"+b.getIdAuthor()+"', '"+b.getIdLanguage()+"', '"+b.getImageUrl()+ "', '"+b.getPrix()+"', '"+b.getRating()+"', '"+b.getNbrPages()+ "', '"+b.getPublishDate()+"', '"+b.getQuantity()+"')";
       
        Statement stm = cnx.createStatement();
        stm.executeUpdate(request);
    }
    
    
    public void updateBook(Book b) throws SQLException {
      
        String req = "UPDATE `books` SET `title`=?,`description`=?,`idCategory`=?,`idAuthor`=?,"
                + "`idLanguage`=?,`imageUrl`=?,`prix`=?,`rating`=?,`nbrPages`=?,`publishDate`=?,"
                + "`quantity`=? "
                + "WHERE `id` = ?";
        
        PreparedStatement pst = cnx.prepareStatement(req);

        pst.setString(1, b.getTitle());
        pst.setString(2, b.getDescription());
        pst.setInt   (3, b.getIdCategory());
        pst.setInt(4, b.getIdAuthor());
        pst.setInt(5, b.getIdLanguage());
        pst.setString(6, b.getImageUrl());
        pst.setFloat(7, b.getPrix());
        pst.setInt(8, b.getRating());
        pst.setInt(9, b.getNbrPages());
        pst.setString(10, b.getPublishDate());
        pst.setInt(11, b.getQuantity());
        pst.setInt(12, b.getId());
        pst.executeUpdate();

    }
    
    public void deleteBook(int id) throws SQLException {
        String request = "DELETE FROM `books` WHERE id =" + id;
        Statement stm = cnx.createStatement();
        stm.executeUpdate(request);
    }
    
        public ArrayList<Book> getBooks() throws SQLException {
        ArrayList<Book> results = new ArrayList<>();
        String request = "SELECT * FROM `books`";
        Statement stm = cnx.createStatement();
        ResultSet rst = stm.executeQuery(request);
        
        while (rst.next()) {
            Book b = new Book();
            b.setId(rst.getInt(1));
            b.setTitle(rst.getString(2));
            b.setDescription(rst.getString(3));
            b.setIdCategory(rst.getInt(4));
            b.setIdAuthor(rst.getInt(5));
            b.setIdLanguage(rst.getInt(6));
            b.setImageUrl(rst.getString(7));
            b.setPrix(rst.getFloat(8));
            b.setRating(rst.getInt(9));
            b.setNbrPages(rst.getInt(10));
            b.setPublishDate(rst.getString(11));
            b.setQuantity(rst.getInt(12));
            
            results.add(b);
        }

        return results;
    }
         public Book getBook(int id) throws SQLException {
        String request = "SELECT * FROM `books` WHERE id =" + id;
        Statement stm = cnx.createStatement();
        ResultSet rst = stm.executeQuery(request);

        if (rst.next()) {
            Book b = new Book();
            b.setId(rst.getInt(1));
            b.setTitle(rst.getString(2));
            b.setDescription(rst.getString(3));
            b.setIdCategory(rst.getInt(4));
            b.setIdAuthor(rst.getInt(5));
            b.setIdLanguage(rst.getInt(6));
            b.setImageUrl(rst.getString(7));
            b.setPrix(rst.getFloat(8));
            b.setRating(rst.getInt(9));
            b.setNbrPages(rst.getInt(10));
            b.setPublishDate(rst.getString(11));
            b.setQuantity(rst.getInt(12));
            return b;
        }

        return null;
    }
    
    
    
        
        
    
    
    
    
}
