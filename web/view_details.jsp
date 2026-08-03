<%-- 
    Document   : view_details
    Created on : 6 Apr, 2024, 4:40:05 PM
    Author     : Rohit
--%>

<%@page import="dto.UuserDTO"%>
<%@page import="java.util.List"%>
<%@page import="model.BCAbooksAuth"%>
<%@page import="dto.Book_details"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View_details Page</title>
    </head>
    <%@include file="all_components.jsp" %>
    <body style="background-color: #f0f1f2;">
          <%
            UuserDTO user = (UuserDTO) session.getAttribute("user");            
            if(user==null)
            {
                response.sendRedirect("login.jsp");
            }
            else
            {
            String email = user.getEmail();
        %>
        <div class="container p-3" >
            <div class="row"> 
                <%
                       BCAbooksAuth auth=new BCAbooksAuth();  
             List<Book_details> list=auth.getBCABooks();
             String bookID = request.getParameter("bookID");
             for(Book_details b :list)
              {
                  if(String.valueOf(b.getBookID()).equals(bookID))
                  {
                %>
                <div class="col-md-6 text-center p-5 border bg-white"> 
                    <img src="image/<%=b.getBimg()%>" style="height: 150px; width: 150px"><br>
                    <h4 class="mt-3"> Book Name :<span class="text-success"><%=b.getBname()%></span></h4>
                    <h4>Author Name : <span class="text-success"><%=b.getAuthor()%></span></h4>
                    <h4>Category : <span class="text-success"> <%=b.getBtype()%> </span></h4>
                </div>
                <div class="col-md-6 text-center p-5 border bg-white" >
                    <h2><%=b.getBname()%></h2>
                     <p>Contact to Seller</p>
                    <p>Email :<%=b.getEmail() %> </p>
                    <div class="row"> 
                        <div class="col-md-4 text-danger text-center p-2">
                            <i class="fas fa-money-bill-wave fa-2x"></i>
                            <p>Cash On Delivery</p>
                        </div>
                        <div class="col-md-4 text-danger text-center p-2">
                            <i class="fas fa-undo-alt fa-2x"></i>
                            <p>Return Available</p>
                        </div>
                        <div class="col-md-4 text-danger text-center p-2">
                            <i class="fas fa-truck-moving fa-2x"></i>
                            <p>Free Shipping</p>
                        </div>
                        
                    </div>
                    <div class=" text-center p-3 ">
                        <a href="CartServlet?bookID=<%=b.getBookID()%>&&userID=<%=user.getUserID()%>" class="btn btn-primary"><i class="fas fa-cart-plus" ></i>Add Cart</a>
                        <a href="" class="btn btn-danger"><i class="fas fa-rupee-sign" ></i><%=b.getPrice()%></a>
                         <a href="index.jsp" class="btn btn-warning text-center">Home</a>
                </div>
            </div>
             <%} }} %>  
        </div>
        </div>
        
        
    </body>
</html>
