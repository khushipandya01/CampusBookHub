/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.Book_details;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UpdateBooksAuth;

/**
 *
 * @author Rohit
 */
public class Edit_BookServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.sendRedirect("edit_books.jsp");
    }
     public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
       String id=request.getParameter("id");
        String bname=request.getParameter("bname");
        String author=request.getParameter("author");
        String price=request.getParameter("price");
        String btype=request.getParameter("btype");
        String bstatus=request.getParameter("bstatus");
        
        System.out.println(id+"\n"+bname+"\n"+author+"\n"+price+"\n"+btype+"\n"+bstatus+"\n");
        Book_details b=new Book_details();
        b.setBookID(id);
        b.setBname(bname);
        b.setAuthor(author);
        b.setPrice(price);
        b.setBtype(btype);
        b.setBstatus(bstatus);
        
     
         
         UpdateBooksAuth auth1=new UpdateBooksAuth();
         boolean book=auth1.updateEditBooks(b);
         HttpSession session=request.getSession();
        if(book)
        {
           
            session.setAttribute("succMsg", "Book Update Succesfully");
            response.sendRedirect("allbooks.jsp");
        }
        else
        {
              
            session.setAttribute("failedMsg","Something went Wrong");
            response.sendRedirect("allbooks.jsp");
        }
    }
}
