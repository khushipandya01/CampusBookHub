/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.AddbookDTO;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.AddbookAuth;
@MultipartConfig

/**
 *
 * @author Rohit
 */
public class Addbook extends HttpServlet 
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
    {
        response.sendRedirect("addbook.jsp");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
    {
        String bname=request.getParameter("bname");
        String author=request.getParameter("author");
        String price=request.getParameter("price");
        String btype=request.getParameter("btype");
        String bstatus=request.getParameter("bstatus");
        Part part=request.getPart("bimg");
        String fileName=part.getSubmittedFileName();
        String email=request.getParameter("email");
        
        AddbookDTO book=new AddbookDTO();
        book.setBname(bname);
        book.setAuthor(author);
        book.setPrice(price);
        book.setBtype(btype);
        book.setBstatus(bstatus);
        book.setPhotoName(fileName);
        book.setEmail(email);
        
        AddbookAuth auth=new AddbookAuth();
        boolean b=auth.isAddbook(book);
        
        if(b)
        {
            String path=getServletContext().getRealPath("") + "image";
            File file =new File(path);
            part.write(path + File.separator + fileName);
            System.out.println(path);
            
            
            HttpSession session=request.getSession();
            
            session.setAttribute("succMsg", "Book Add Successfully");
            response.sendRedirect("addbook.jsp");
        }
        else
        {
            HttpSession session=request.getSession();
            session.setAttribute("failedMsg", "Something Wrong on Server");
            response.sendRedirect("addbook.jsp");
        }
    }
}

  
