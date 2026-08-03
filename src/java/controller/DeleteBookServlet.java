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
import model.DeleteBookAuth;

/**
 *
 * @author Rohit
 */
public class DeleteBookServlet extends HttpServlet 
{
  
     public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
  String id=request.getParameter("id");
  
  
  DeleteBookAuth auth=new DeleteBookAuth();
  boolean isDelete=auth.delete_Book(id);
  
  HttpSession session=request.getSession();
  if(isDelete)
  {
      session.setAttribute("succMsg", "Deleted Book Successfully");
      response.sendRedirect("allbooks.jsp");
  }
  else
  {
       session.setAttribute("failedMsg", "Something went Wrong");
      response.sendRedirect("allbooks.jsp");
  }
     
     
     
    }
}

