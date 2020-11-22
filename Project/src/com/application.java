/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.models.Author;
import com.models.AuthorPrefer;
import com.models.Category;
import com.models.CommandLine;
import com.models.CommandList;
import com.models.Comment;
import com.models.Interaction;
import com.models.WishList;
import com.services.ServiceInteraction;
import com.services.ServiceAuthor;
import com.services.ServiceCategory;
import com.services.ServiceCommandLine;
import com.services.ServiceCommandList;
import com.services.ServiceComment;
import com.services.ServicePreferAuthor;
import com.services.ServiceWishList;
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
  
//  ++++++++++++++++ AUTHOR CRUD TEST ++++++++++++++++++++++
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
        
// ++++++++++++++++  Comments CRUD TEST  ++++++++++++++++++++++
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
           // ServiceInteraction is=new ServiceInteraction();
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
            //ServiceWishList ws=new ServiceWishList();
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
          

              //++++++++++++++++ Test Category++++++++++++++++++++++
         //   ServiceCategory cs = new ServiceCategory();
           // Category c2 = new Category("Drama"); // (name)
           // Category c3 = new Category("Action");
            
        //  Ajout de 2 categories
          //  cs.addCategory(c2);
          //  cs.addCategory(c3);
        
        //  Affichage des categories
          //  System.out.println(cs.getCategories());
            
        //  Modification d'une categorie
            
         //   Category c4= new Category(2,"Adventure");
         //   cs.updateCategory(c4);
           // System.out.println(cs.getCategories());
            
        //  Suppression d'une interaction
                
          //  cs.deleteCategory(1);
          //  System.out.println(cs.getCategories());
            
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    // System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    
    //++++++++++++++++ Test CommandLine ++++++++++++++++++++++++++++
         //   ServiceCommandLine scl = new ServiceCommandLine();
         //   CommandLine cl1 = new CommandLine(11,3,5); // (quantity,idCommandList,idBook)
         //   CommandLine cl2 = new CommandLine(7,2,4);
            
        //  Ajout de 2 wishlists
         //   scl.addCommandLine(cl1);
         //   scl.addCommandLine(cl2);
        
        //  Affichage des lignes de commandes
          //  System.out.println(scl.getCommandLine());
            
        //  Modification d'une ligne de commande
            
          //  CommandLine cl3 = new CommandLine();
          //  cl3.setId(3);
          //  cl3.setQuantity(10);
          //  scl.updateCommandLine(cl2);
          //  System.out.println(scl.getCommandLine());
            
        //  Suppression d'une ligne de commande
            
           // scl.deleteCommandLine(2);
           // System.out.println(scl.getCommandLine());
            
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
        //++++++++++++++++ Test Liste de Commande ++++++++++++++++++++++
           // ServiceCommandList cls=new ServiceCommandList();
           // CommandList cli1=new CommandList("Livré",4,1); // (status,price,idUser)
           // CommandList cli2=new  CommandList("Livré",33,1);
            
       //  Ajout de 2 ligne de commande
      // cls.addCommandList(cli1);
      // cls.addCommandList(cli2);
        // Affichage des CommandLists
        //    System.out.println(cls.getCommandList());
            
         // Modification d'une ligne de commande
           
         //   CommandList cli3 = new CommandList(1,"En cours",4,1);
         //   cls.updateCommandList(cli3);
         //   System.out.println(cls.getCommandList());
        //    
        // Suppression d'une ligne de commande
                
         //  cls.deleteCommandList(4);
         //   System.out.println(cls.getCommandList());
            
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            
            launch(args);
    

    }
    
}
