/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.Book_details;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rohit
 */
public class UpdateBooksAuth {
       public boolean updateEditBooks(Book_details b)
    { 
        String bname=b.getBname();
        String author=b.getAuthor();
        String price=b.getPrice();
        String btype=b.getBtype();
        String bstatus=b.getBstatus();
        String bookID=b.getBookID();
        
        
        try{
            Statement st=DBConnector.getStatement();
             String query="UPDATE book_details SET bookname='"+bname+"',author='"+author+"',price='"+price+"',bookcategory='"+btype+"',status='"+bstatus+"' where bookID='"+bookID+"'";
             System.out.println("Query="+query);
             System.out.println(query);
             
             int i=st.executeUpdate(query);
             if(i>0)
             {
                 return true;
             }
             else
             {
                 return false;
             }
        }
        catch(SQLException e)
        {
            System.out.println(e); 
        }
      
       
        if(bname!=null && author!=null)
        {
            return true;
        }
         return false;     
    }
}
