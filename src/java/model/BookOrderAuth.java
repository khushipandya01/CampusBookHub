/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.BookOrderDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Rohit
 */
public class BookOrderAuth {
    //private Connection conn;
    public boolean saveOrder(BookOrderDTO bo)
    {
        String order_id=bo.getOrder_id();
        String user_name=bo.getName();
        String email=bo.getEmail();
        String address=bo.getFullAddress();
        String phone=bo.getPhone();
        String bname=bo.getBname();
        String author=bo.getAuthor();
        String price=bo.getPrice();
        String payment=bo.getPaymentType();
        
        
        boolean f=false;
        try
        {
            Statement st=DBConnector.getStatement();
           
            String query="INSERT INTO order_details(order_id,user_name,email,address,phone,bname,author,price,payment)VALUES('"+order_id+"','"+user_name+"','"+email+"','"+address+"','"+phone+"','"+bname+"','"+author+"','"+price+"','"+payment+"')";
            System.out.println("Query="+query);
            
           // conn.setAutoCommit(false);
            int i=st.executeUpdate(query);
            if(i>0)
            {
             //conn.commit();
            f=true;
           // conn.setAutoCommit(true);
            }
            return f;
           // PreparedStatement ps=conn.prepareStatement(query);
/*            for( BookOrderDTO b:blist)
            {
               ps.setString(1, b.getOrder_id());
               ps.setString(2, b.getName());
               ps.setString(3, b.getEmail());
               ps.setString(4, b.getFullAddress());
               ps.setString(5, b.getPhone());
               ps.setString(6, b.getBname());
               ps.setString(7, b.getAuthor());
               ps.setString(8, b.getPrice());
               ps.setString(9, b.getPaymentType());
               ps.addBatch();
            }
            int[] count=ps.executeBatch();*/
           
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return f;
    }
}
