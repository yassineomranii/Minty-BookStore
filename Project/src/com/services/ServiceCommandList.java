/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.models.ListeCommande;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ali
 */
public class ServiceListeCommande {
    
    private Connection cnx;

    public ServiceListeCommande() {
        cnx = MyConnection.getInstance().getConnection();
    }

    public void addListeCommande(ListeCommande lc) throws SQLException {
        String request = "INSERT INTO `commandlist` (`id`, `status`, `totalprice`, 'idUser')"
                + " VALUES (NULL, '" + lc.getStatus() + "', '" + lc.getTotalprice() + "', '"+ lc.getIdUser()+ "')";

        Statement stm = cnx.createStatement();
        stm.executeUpdate(request);
    }
    
    public ArrayList<ListeCommande> getListeCommande() throws SQLException {
        ArrayList<ListeCommande> results = new ArrayList<>();
        String request = "SELECT * FROM `commandlist`";
        Statement stm = cnx.createStatement();
        ResultSet rst = stm.executeQuery(request);

        while (rst.next()) {
            ListeCommande lc = new ListeCommande();
            lc.setId(rst.getInt("id"));
            lc.setStatus(rst.getString(2));
            lc.setTotalprice(rst.getFloat(3));
            lc.setIdUser(rst.getInt(3));
            results.add(lc);
        }

        return results;
    }

    public void updateListeCommande(ListeCommande lc) throws SQLException {
        String request = "UPDATE `commandlist` SET `status`=?,`totalprice`=?, 'idUser'=? "
                + "WHERE `id` = ?";
        PreparedStatement pst = cnx.prepareStatement(request);

        pst.setString(1, lc.getStatus());
        pst.setFloat(2, lc.getTotalprice());
        pst.setInt(3, lc.getIdUser());
        pst.setInt(4, lc.getId());
        pst.executeUpdate();

    }
    
     public void deleteListeCommande(int id) throws SQLException {
        String request = "DELETE FROM `commandlist` WHERE id =" + id;
        Statement stm = cnx.createStatement();
        stm.executeUpdate(request);
    }

}


