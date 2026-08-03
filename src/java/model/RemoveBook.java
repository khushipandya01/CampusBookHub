/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rohit
 */
public class RemoveBook {
    
    public boolean removeBook(int bookID,int userID)
    {
        try
        {
            Statement st=DBConnector.getStatement();
            String query="DELETE FROM cart WHERE bookID='"+bookID+"' and userID='"+userID+"'";
//            st.setInt(1,bookID);
//              st.setInt(2,userID);
            System.out.println("Query ="+query);
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
