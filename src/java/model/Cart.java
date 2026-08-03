/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.Book_details;
import dto.CartDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rohit
 */
public class Cart {
    public List<CartDTO> getBookByUser(int userID)
    {
        List<CartDTO> list=new ArrayList<CartDTO>();
        int totalPrice=0;
        
        try
        {
         Statement st=DBConnector.getStatement();
         String query="SELECT * FROM book_details WHERE bookID=(SELECT bookid FROM cart WHERE userID='"+userID+"' LIMIT 0,1)";
            System.out.println("Query ="+query);
//         st.setInt(1,userID);
         ResultSet rs=st.executeQuery(query);
         
         while(rs.next())
         {
             CartDTO c=new CartDTO();
             c.setCartID(rs.getInt(1));
             c.setBookID(rs.getInt(1));
             c.setUserID(userID);
             
             c.setBname(rs.getString(2));
             c.setAuthor(rs.getString(3));
             c.setPrice(rs.getString(4));
             
             Book_details b=new Book_details();
             b.setBname(rs.getString(2));
             b.setAuthor(rs.getString(3));
             b.setPrice(rs.getString(4));
             totalPrice=totalPrice+rs.getInt(4);
             b.setPrice(String.valueOf(totalPrice));
             System.out.println(totalPrice);
             c.setTotal_price(String.valueOf(totalPrice));
                list.add(c);
         }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return list;
    }
}
