/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.models.Author;
import com.models.AuthorPrefer;
import com.services.ServiceAuthor;
import com.services.ServicePreferAuthor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author DellXPS
 */
public class application extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/home.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiceAuthor sa = new ServiceAuthor();
        ServicePreferAuthor spa = new ServicePreferAuthor();
        try {
//            AuthorPrefer ap=new AuthorPrefer(1,1);
//            spa.addPreferAuthor(ap);
//            spa.updateAuthorPrefer(ap);
            spa.deleteAuthorPrefer(1);
            System.out.println(spa.getAuthorPrefer(2));
//            sa.addAuthor(new Author("a", "a", ""));
//            sa.deleteAuthor(1);
//            Author a = new Author(2, "ggg", "gg", "mlml");
//            sa.updateAuthor(a);
//                System.out.println(sa.getAuthors());
//                System.out.println(sa.getAuthor(2));
        } catch (SQLException ex) {
            System.out.println("ereeur");
        }
        
        
    }
    
}
