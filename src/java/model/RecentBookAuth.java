/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.Book_details;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rohit
 */
public class RecentBookAuth {
    String btype;

    public RecentBookAuth(String btype) 
    {
        this.btype = btype;
    }
    
     public List<Book_details> getAllRecentBooks()
     {
          List<Book_details> list = new ArrayList<Book_details>();
          
             try
             {
                 Statement st=DBConnector.getStatement();
                 String query="SELECT * FROM book_details WHERE bookcategory='"+btype+"' ";
                 System.out.println("Query = "+query);
                 ResultSet rs=st.executeQuery(query);
                 
                 while(rs.next())
                 {
                     Book_details b=new Book_details();
                     b.setBookID(rs.getString(1));
                     b.setBname(rs.getString(2));
                     b.setAuthor(rs.getString(3));
                     b.setPrice(rs.getString(4));
                     b.setBtype(rs.getString(5));
                     b.setBstatus(rs.getString(6));
                     b.setBimg(rs.getString(7));
                     b.setEmail(rs.getString(8));
                     list.add(b);
                 }
             }
             catch(SQLException e)
             {
                 System.out.println(e);
             }
             return list;
     }
       
    
}
