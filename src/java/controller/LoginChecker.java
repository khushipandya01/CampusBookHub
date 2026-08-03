/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UuserDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;

/**
 *
 * @author Rohit
 */
public class LoginChecker extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        response.sendRedirect("login.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        String email=request.getParameter("email");
        String password=request.getParameter("password");
       // String name=request.getParameter("name");
        
        UuserDTO user=new UuserDTO();
        user.setEmail(email);
        user.setPassword(password);
       // user.setName(name);
        
        LoginAuthenticator auth=new LoginAuthenticator();
        boolean login=auth.isLogin(user);
        
        HttpSession session=request.getSession();
        if(login)
        {
            if(email.equalsIgnoreCase("admin@gmail.com"))
            {
                
         
            session.setAttribute("user", user);
            session.setAttribute("email", email);
            response.sendRedirect("admin.jsp");
            }
            else{
           
            
            session.setAttribute("user", user);
            response.sendRedirect("index.jsp");
            }
            
        }
        else
        {
            
            session.setAttribute("failedMsg", "Email & Password Invalid");
            response.sendRedirect("login.jsp");
        }
    }
    
}


