/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.AddbookDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rohit
 */
public class AddbookAuth {
    public boolean isAddbook(AddbookDTO book)
    {
        String bname=book.getBname();
        String author=book.getAuthor();
        String price=book.getPrice();
        String btype=book.getBtype();
        String bstatus=book.getBstatus();
        String photoName=book.getPhotoName();
        String email=book.getEmail();
        
        try
        {
            Statement st=DBConnector.getStatement();
            String query="INSERT INTO book_details(`bookname`,`author`,`price`,`bookcategory`,`status`,`photo`,`user_Email`)VALUES('"+bname+"','"+author+"','"+price+"','"+btype+"','"+bstatus+"','"+photoName+"','"+email+"')";
            System.out.println("Query = "+query);
            
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
        if(bname!=null && author!=null && price!=null && btype!=null && email!=null)
        {
            return true;
        }
        return false;
    }
}
