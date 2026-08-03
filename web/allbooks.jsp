<%-- 
    Document   : allbooks
    Created on : 27 Mar, 2024, 11:48:29 PM
    Author     : Rohit
--%>

<%@page import="model.Allbooks"%>
<%@page import="java.util.List"%>
<%@page import="dto.Book_details"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All books page</title>
    </head>
    <body>
        <%@include file="all_components.jsp" %>
        <h3 class="text-center">Hello Admin</h3>
         
        <table class="table table-striped ">
            <thead class="bg-primary text-white">
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Image</th>
                    <th scope="col">Book Name</th>
                    <th scope="col">Author</th>
                    <th scope="col">Price</th>
                    <th scope="col">Categories</th>
                    <th scope="col">Status</th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <% 
                Allbooks auth=new Allbooks();
                List<Book_details> list=auth.getAllBooks();
                for(Book_details b : list)
                {
                    
                %>
                <tr>
                    <td><%=b.getBookID()%></td>
                    <td><img src="../image/<%=b.getBimg() %>>"</td>
                    <td><%=b.getBname() %></td>
                    <td><%=b.getAuthor() %></td>
                    <td><%=b.getPrice() %></td>
                    <td><%=b.getBtype() %></td>
                    <td><%=b.getBstatus() %></td>
                    <td>
                        <a href="edit_books.jsp?id=<%=b.getBookID() %>" class="btn btn-sm btn-primary" >Edit</a>
                        <a href="DeleteBookServlet?id=<%=b.getBookID() %>" class="btn btn-sm btn-danger" >Delete</a>
                    </td>

                </tr>
                <%
                }
                %>
            </tbody>
        </table>
             <div class="container text-center mt-3">
                 <a href="admin.jsp" class="btn btn-primary text-center"> Admin Home</a>
                 </div>

    </body>
</html>
