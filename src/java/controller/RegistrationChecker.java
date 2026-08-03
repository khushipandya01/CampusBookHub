/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.RuserDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CheckUserAuth;
import model.RegistrationAuthenticator;

/**
 *
 * @author Rohit
 */
public class RegistrationChecker extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("registration.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String contact = request.getParameter("contact");
        String pincode = request.getParameter("pincode");
        
        RuserDTO ruser = new RuserDTO();
        ruser.setName(name);
        ruser.setEmail(email);
        ruser.setPassword(password);
        ruser.setContact(contact);
        ruser.setPincode(pincode);
        
          CheckUserAuth auth = new CheckUserAuth();
          boolean f = auth.checkUser(email);   
        RegistrationAuthenticator rauthenticator = new RegistrationAuthenticator();
        boolean register = rauthenticator.isRegister(ruser);
        
        HttpSession session = request.getSession();
      
        if (f) {
            if (register) {
                
                session.setAttribute("name", name);
                response.sendRedirect("login.jsp");
            } else {
                response.sendRedirect("register.jsp");
            }            
        } else {
            response.sendRedirect("register.jsp");
        }
        
    }
}
