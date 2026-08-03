<%-- 
    Document   : logout
    Created on : 1 Apr, 2024, 8:52:24 PM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <body>
       <%
           session.invalidate();
           response.sendRedirect("login.jsp");
           
       %>
    </body>
</html>