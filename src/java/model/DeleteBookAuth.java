/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.Book_details;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rohit
 */
public class DeleteBookAuth {
   public boolean delete_Book(String id)
    {
       
        try
        {
            Statement st=DBConnector.getStatement();
            
            String query="DELETE FROM book_details WHERE bookID='"+id+"'";
            System.out.println("Query="+query);
            int i=st.executeUpdate(query);
            if(i>0)
            {
                return true;
            }
            return false;
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
}
