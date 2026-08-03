/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.BookOrderDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rohit
 */
public class OrdersAdmin {
     public List<BookOrderDTO> getAllBook(){
         List<BookOrderDTO> list=new ArrayList<BookOrderDTO>();
         
         try
         {
             Statement st=DBConnector.getStatement();
             String query="SELECT * FROM order_details";
             System.out.println("query="+query);
             ResultSet rs=st.executeQuery(query);
             while(rs.next())
             {
                 BookOrderDTO o=new BookOrderDTO();
                 o.setId(rs.getInt(1));
                 o.setOrder_id(rs.getString(2));
                 o.setName(rs.getString(3));
                 o.setEmail(rs.getString(4));
                 o.setFullAddress(rs.getString(5));
                 o.setPhone(rs.getString(6));
                 o.setBname(rs.getString(7));
                 o.setAuthor(rs.getString(8));
                 o.setPrice(rs.getString(9));
                 o.setPaymentType(rs.getString(10));
                 list.add(o);
                 
             }
         }
         catch(SQLException e)
         {
             System.out.println(e);
         }
        return list;
    }
    
    
}



