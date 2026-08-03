<%-- 
    Document   : setting
    Created on : 22 Apr, 2024, 1:03:58 PM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>setting Page</title>
        
        <style type="text/css" >
            a{
                text-decoration: none;
                color: black;
            }
            a:hover{
                text-decoration: none;
            }
            </style>
    </head>
    <body style="background-color: #f7f7f7;">
        <%@include file="all_components.jsp" %>
        <div class="container">
            <h3 class="text-center">Hello user</h3>
            <div class="row p-5">
                <div class="col-md-6">
                    <a href="addbook.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-primary"><i class="fas fa-book-open fa-3x" ></i></div>
                                <h3>Sell Your Book</h3>
                            </div>
                        </div>
                    </a>
                </div>
                
                     <div class="col-md-6">
                    <a href="editProfile.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-primary"><i class="fas fa-edit fa-3x" ></i></div>
                                <h3>Edit Your Profile</h3>
                            </div>
                        </div>
                    </a>
                </div>
                
                     <div class="col-md-6">
                    <a href="viewYourOrder.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-danger"><i class="fas fa-box-open fa-3x" ></i></div>
                                <h3>My Order</h3>
                                <p>Track Your Order</p>
                            </div>
                        </div>
                    </a>
                </div>
                
                     <div class="col-md-6">
                    <a href="help.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-waring"><i class="fas fa-user-circle fa-3x" ></i></div>
                                <h3>Help Center</h3>
                                <p>24*7 Service</p>
                            </div>
                        </div>
                    </a>
                </div>
            </div>
        </div>
         <div class="container text-center mt-3">
                 <a href="index.jsp" class="btn btn-warning text-center">Home</a>
                 </div>
    </body>
</html>
