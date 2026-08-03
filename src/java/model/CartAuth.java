/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.CartDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rohit
 */
public class CartAuth {
    public boolean addCart(CartDTO c)
    {
        int bookID=c.getBookID();
        int userID=c.getUserID();
        
       try{
        Statement st=DBConnector.getStatement();
        String query="INSERT INTO cart(bookID,userID)VALUES('"+bookID+"','"+userID+"')";
         System.out.println("Query="+query);
        int i=st.executeUpdate(query);
        if(i>0)
        {
            return true;
        }
        
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
        return false;
    }
}
