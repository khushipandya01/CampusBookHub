/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.BookOrderDTO;
import dto.CartDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.BookOrderAuth;
import model.Cart;

/**
 *
 * @author Rohit
 */
public class OrderServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        HttpSession session=request.getSession();
        int id =Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String phone=request.getParameter("phone");
        String address=request.getParameter("address");
        String landmark=request.getParameter("landmark");
        String city=request.getParameter("city");
        String state=request.getParameter("state");
        String pincode=request.getParameter("pincode");
        String paymentType=request.getParameter("paymentType");
        String bname=request.getParameter("bname");
        String author=request.getParameter("author");
        String totalPrice=request.getParameter("totalPrice");
        
        BookOrderDTO bo=new BookOrderDTO();
       
        bo.setEmail(email);
        bo.setBname(bname);
        bo.setAuthor(author);
        bo.setFullAddress(address);
        bo.setId(id);
        bo.setName(name);
        bo.setPhone(phone);
        bo.setPrice(totalPrice);
        bo.setPaymentType(paymentType);
        Random r=new Random();
        bo.setOrder_id("BOOK-ORD-00"+r.nextInt(1000));
            
        
        
        String fullAddress=address+","+landmark+","+city+","+state+","+pincode;
        
        System.out.println(id+" "+name+""+email+""+phone+""+fullAddress+"" +totalPrice+"" +paymentType);
        
        Cart auth=new Cart();
        List<CartDTO> cart=auth.getBookByUser(id);
       if(cart.isEmpty())
       {
           session.setAttribute("failedMsg", "Add Item first");
           response.sendRedirect("cart.jsp");
       }
       else{
//        BookOrderAuth boa=new BookOrderAuth();
        
        
        
        // ArrayList<BookOrderDTO> orderlist=new ArrayList<BookOrderDTO>();
      //  Random r=new Random();
//        Iterator<BookOrderDTO> i = orderlist.iterator();
//        while(i.hasNext())   
//        {
//            BookOrderDTO o=i.next();
//            o.setOrder_id("BOOK-ORD-00"+r.nextInt(1000));
//            o.setName(name);
//            o.setEmail(email);
//            o.setPhone(phone);
//            o.setFullAddress(fullAddress);
//            /*o.setBname(c.getBname());
//            o.setAuthor(c.getAuthor());
//            o.setPrice(c.getPrice()+"");*/
//            o.setPaymentType(paymentType);
//            orderlist.add(o);
//            
//        }
        
        
        if(paymentType.equals("noselect"))
        {
            session.setAttribute("failedMsg", "please choose Payment Method");
            response.sendRedirect("cart.jsp");
        }
        else
        {
              BookOrderAuth boa=new BookOrderAuth();
              boolean f=boa.saveOrder(bo);

            
            if(f)
            {
                response.sendRedirect("order_success.jsp");
                System.out.println("Order Success");
            }
            else
            {
                session.setAttribute("failedMsg", "order failed");
                System.out.println("Order Failed");
            }
        }
    }
    }
}

