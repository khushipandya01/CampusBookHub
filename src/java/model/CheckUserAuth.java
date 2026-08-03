/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rohit
 */
public class CheckUserAuth {
    
    public boolean checkUser(String em)
    {
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT * FROM sregister WHERE email='"+em+"'";
           // st.setString(1,em);
            System.out.println("Query = "+query);
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return true;
    }
}
