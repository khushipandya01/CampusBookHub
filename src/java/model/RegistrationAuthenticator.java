/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.RuserDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rohit
 */
public class RegistrationAuthenticator
{
    public boolean isRegister(RuserDTO ruser)
    {
        String name=ruser.getName();
        String email=ruser.getEmail();
        String password=ruser.getPassword();
        String contact=ruser.getContact();
        String pincode=ruser.getPincode();
        String tablepassword="";
        try
        {
            Statement st=DBConnector.getStatement();
            String query="INSERT INTO sregister(`name`,email,password,contact,pincode)VALUES('"+name+"','"+email+"','"+password+"','"+contact+"','"+pincode+"')";
            
            System.out.println("Query =" +query);
            
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
        
        return false;
    }
}
