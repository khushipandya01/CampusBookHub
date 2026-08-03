/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.Book_details;
import dto.CartDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CartAuth;

/**
 *
 * @author Rohit
 */
public class CartServlet extends HttpServlet 
{
     public void doGet(HttpServletRequest request,HttpServletResponse response )throws ServletException,IOException
     {
         int bookID =Integer.parseInt(request.getParameter("bookID"));
         int userID=Integer.parseInt(request.getParameter("userID"));
        // String bname=request.getParameter("bname");
         
         
         Book_details b=new Book_details();
         
         CartDTO c=new CartDTO();
         c.setBookID(bookID);
         c.setUserID(userID);
        
         c.setBname(b.getBname());
         c.setAuthor(b.getAuthor());
         c.setPrice(b.getPrice());
         c.setPrice(b.getPrice());
         
         CartAuth auth=new CartAuth();
         boolean f=auth.addCart(c);
         
         HttpSession session=request.getSession();
         if(f)
         {
             session.setAttribute("addCart", "Book Added to Cart");
             response.sendRedirect("all_newbooks.jsp");
             System.out.println("Add Cart Success");
         }
         else
         {
             session.setAttribute("failed", "Something Wrong on server");
             response.sendRedirect("all_newbooks.jsp");
             System.out.println("not added to cart");
         }
     }
}


