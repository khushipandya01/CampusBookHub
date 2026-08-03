<%-- 
    Document   : order_success
    Created on : 21 Apr, 2024, 5:44:02 PM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="all_components.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>order_success Page</title>
        
    </head>
    <body style="background-color: #f0f1f2">
        
        <div class="container text-center mt-3">
            <i class="fas fa-check-circle fa-5x text-success" ></i>
            <h1>Thank you</h1>
            <h2>Your Order Successfully</h2>
            <h5>With in 7 Days Your Product Will be Delivered in your Address</h5>
            <a href="index.jsp" class="btn btn-primary mt-3">Home</a>
            <a href="viewYourOrder.jsp" class="btn btn-danger mt-3">View Order</a>
        </div>
    </body>
</html>
