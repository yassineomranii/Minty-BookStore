/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.models.Author;
import com.models.AuthorPrefer;
import com.models.Comment;
import com.models.Interaction;
import com.models.WishList;
import com.services.InteractionService;
import com.services.ServiceAuthor;
import com.services.ServiceComment;
import com.services.ServicePreferAuthor;
import com.services.WishListService;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public static void main(String[] args) throws SQLException {
  
//        AUTHOR CRUD TEST 
//        ServiceAuthor sa = new ServiceAuthor();
//        ServicePreferAuthor spa = new ServicePreferAuthor();
//        try {
//            AuthorPrefer ap=new AuthorPrefer(1,1);
//            spa.addPreferAuthor(ap);
//            spa.updateAuthorPrefer(ap);
//            spa.deleteAuthorPrefer(1);
//            System.out.println(spa.getAuthorPrefer(2));
//            sa.addAuthor(new Author("a", "a", ""));
//            sa.deleteAuthor(1);
//            Author a = new Author(2, "ggg", "gg", "mlml");
//            sa.updateAuthor(a);
//                System.out.println(sa.getAuthors());
//                System.out.println(sa.getAuthor(2));
//        } catch (SQLException ex) {
//            System.out.println("ereeur");
//        }
        
//        Comments CRUD TEST 
//        ServiceComment sc = ServiceComment.getInstance();
//        sc.addComment(new Comment("Nice book"), 1, 2); 
//        ArrayList<Comment> comments = sc.getComments();
//        for (Comment c : comments) {
//            System.out.println(c.toString());
//        }
//        sc.editComment(3, "NiCE BOOK BOOK");
//        for (Comment c : sc.getComments()) {
//            System.out.println(c.toString());
//        }
//          sc.deleteComment(3);


 //++++++++++++++++ Test Interaction ++++++++++++++++++++++
           // InteractionService is=new InteractionService();
           // Interaction i=new Interaction(1,1,4,0); // (idUser,idBook,ratingValue,liked)
           // Interaction i2=new Interaction(1,1,2,1);
            
        //  Ajout de 2 interactions
           // is.addInteraction(i);
           // is.addInteraction(i2);
        
        //  Affichage des interactions
           // System.out.println(is.getInteractions());
            
        //  Modification d'une interaction
            
           // Interaction i3=new Interaction(8,1,1,2,1);
           // is.updateInteraction(i3);
           // System.out.println(is.getInteraction(8));
            
        //  Suppression d'une interaction
                
           // is.deleteInteraction(4);
           // System.out.println(is.getInteractions());
            
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    
    //++++++++++++++++ Test WishList ++++++++++++++++++++++++++++
            //WishListService ws=new WishListService();
            //WishList w1=new WishList(1,1,"Wish List 1"); // (idUser,idBook,name)
            //WishList w2=new WishList(1,1,"Wish List 2");
            
        //  Ajout de 2 wishlists
            //ws.addWishList(w1);
            //ws.addWishList(w2);
        
        //  Affichage des wishlists
          //  System.out.println(ws.getWishLists());
            
        //  Modification d'une wishlist
            
          //  WishList w3=new WishList();
          //  w3.setId(3);
          //  w3.setName("Wish List updated");
          //  ws.updateWishList(w3);
          //  System.out.println(ws.getWishList(3));
            
        //  Suppression d'une wishlist
            
          //  ws.deleteWishList(4);
          //  System.out.println(ws.getWishLists());
            
    

    }
    
}
