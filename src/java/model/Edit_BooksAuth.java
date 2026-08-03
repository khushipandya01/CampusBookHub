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

/**
 *
 * @author Rohit
 */
public class Edit_BooksAuth {
    
    public Book_details getBookById(String id)
    {
        Book_details b=null;
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT * FROM book_details WHERE bookID ='"+id+"'";
            System.out.println("Query="+query);
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
               b=new Book_details();
               b.setBookID(rs.getString(1)); 
               b.setBname(rs.getString(2));
               b.setAuthor(rs.getString(3));
               b.setPrice(rs.getString(4));
               b.setBtype(rs.getString(5));
               b.setBimg(rs.getString(7));
               b.setBstatus(rs.getString(6));
               b.setEmail(rs.getString(8));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return b;
    }
    
 
}
