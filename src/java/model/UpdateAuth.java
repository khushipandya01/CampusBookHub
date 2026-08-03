/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.RuserDTO;
import dto.UuserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rohit
 */
public class UpdateAuth {
    
    public boolean isUpdate(int id,String email)
    {
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT * FROM sregister WHERE userID='"+id+"' and email='"+email+"'";
            System.out.println("Query="+query);
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
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
    
    public boolean updateProfile(RuserDTO u){
         String name=u.getName();
        String email=u.getEmail();
        String password=u.getPassword();
        String contact=u.getContact();
        String pincode=u.getPincode();
        String tablepassword="";
        try
        {
            Statement st=DBConnector.getStatement();
            String query="UPDATE sregister SET name='"+name+"',password='"+password+"',contact='"+contact+"',pincode='"+pincode+"' WHERE email='"+email+"'";
            
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
        if(name!=null && password!=null && contact!=null && pincode!=null && !name.trim().equals("") && password.equals(tablepassword))
        {
            return true;
        }
        return false;
    }
    }

