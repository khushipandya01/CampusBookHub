/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.RuserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UpdateAuth;

/**
 *
 * @author Rohit
 */
public class UpdateChecker extends HttpServlet
{
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("editProfile.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("userID"));//is line par error aarha h 
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String contact = request.getParameter("contact");
        String pincode = request.getParameter("pincode");
        
        RuserDTO u=new RuserDTO();
        u.setEmail(email);
        u.setName(name);
        u.setPassword(password);
        u.setContact(contact);
        u.setPincode(pincode);
        
        HttpSession session=request.getSession();
        UpdateAuth auth=new UpdateAuth();
        boolean f=auth.isUpdate(id, email);
        if(f)
        {
           boolean f2=auth.updateProfile(u);
           if(f2)
           {
               session.setAttribute("succMsg", "Profile Update Successfully..");
               response.sendRedirect("index.jsp");
           }
           else
           {
               session.setAttribute("failed", "Something Wrong on Server");
               response.sendRedirect("editProfile.jsp");
           }
        }
        else
        {
            session.setAttribute("failedMsg", "Your Password is Incorrect");
            response.sendRedirect("editProfile.jsp");
        }
    }
}
    

  
