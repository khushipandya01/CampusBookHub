/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.UuserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rohit
 */
public class LoginAuthenticator 
{
    public boolean isLogin(UuserDTO user)
    {
        String email=user.getEmail();
        String password=user.getPassword();
        String tablepassword="";
        String name="";
        int userid=0;
        
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT password,userid,name from sregister where email='"+email+"'";
            System.out.println("Query ="+query);
            
            ResultSet rs=st.executeQuery(query);
            
            if(rs.next())
            {
                tablepassword=rs.getString("password");
                name=rs.getString("name");
                userid = rs.getInt("userID");
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(email!=null && password!=null  && !email.trim().equals("") && !password.trim().equals("") && password.equals(tablepassword))
        {
            user.setName(name);
            user.setUserID(userid);
            return true;
        }
        return false;
    }
}
