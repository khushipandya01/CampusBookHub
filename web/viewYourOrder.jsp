<%-- 
    Document   : viewYourOrder
    Created on : 21 Apr, 2024, 11:50:56 PM
    Author     : Rohit
--%>

<%@page import="dto.UuserDTO"%>
<%@page import="dto.BookOrderDTO"%>
<%@page import="java.util.List"%>
<%@page import="model.ViewOrder"%>
 <%@include file="all_components.jsp"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view Order Page</title>
    </head>
    <body>
       
        <div class="container p-1">
            <h3 class="text-center text-primary">Your Order</h3>
            <table class="table table-striped mt-3">
                <thead class="bg-primary text-white">
                    <tr>
                        <th scope="col">Order Id</th>
                        <th scope="col">Name</th>    
                        <th scope="col">Book Name</th>
                        <th scope="col">Author</th>
                        <th scope="col">Price</th>
                        <th scope="col">Payment Type</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                    UuserDTO u=(UuserDTO)session.getAttribute("user");
                    ViewOrder auth=new ViewOrder();
                    List<BookOrderDTO> list=auth.getBook(u.getEmail());
                    for(BookOrderDTO b: list)
                    {
                        
                    
                    %>
                    <tr>
                        <th scope="row"><%=b.getOrder_id()%></th>
                        <td><%=b.getName()%></td>
                        <td><%=b.getBname()%></td>
                        <td><%=b.getAuthor()%></td>
                        <td><%=b.getPrice()%></td>
                        <td><%=b.getPaymentType()%></td>
                         
                          
                    </tr>
                    <% } %>
                </tbody>
            </table>
                 <div class="container text-center mt-3">
                 <a href="index.jsp" class="btn btn-primary text-center">Home</a>
                 </div>
        </div>
    </body>
</html>
