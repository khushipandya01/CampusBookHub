/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RemoveBook;

/**
 *
 * @author Rohit
 */
public class RemoveBookCart extends HttpServlet {

    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int bookID=Integer.parseInt(req.getParameter("bookID").trim());
       int userID=Integer.parseInt(req.getParameter("userID").trim());
       RemoveBook auth=new RemoveBook();
       boolean f=auth.removeBook(bookID,userID);
       
       HttpSession session=req.getSession();
       
       if(f)
       {
           session.setAttribute("succMsg", "Book Removed from Cart");
           resp.sendRedirect("cart.jsp");
       }
       else
       {
           session.setAttribute("failedMsg", "Something went  Wrong");
           resp.sendRedirect("cart.jsp");
       }
       
    }

    
}
