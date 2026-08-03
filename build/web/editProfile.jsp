<%-- 
    Document   : editProfile
    Created on : 22 Apr, 2024, 1:36:41 PM
    Author     : Rohit
--%>




<%@page import="dto.UuserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile Page</title>
        <link rel="stylesheet" href="css/style.css">
        <%@include file="all_components.jsp" %>
           <style>
            body {
    margin: 0;
    padding: 0;
    font-family: sans-serif;
    background: linear-gradient(to right, #b92b27, #1565c0)
}

.card{
    margin-bottom:20px;
    border:none;
}

.box {
    width: 500px;
    padding: 40px;
    position: absolute;
    top: 50%;
    left: 50%;
    background: #191919;
    ;
    text-align: center;
    transition: 0.25s;
    margin-top: 100px
}

.box input[type="text"],
.box input[type="password"],
.box input[type="number"]{
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #3498db;
    padding: 10px 10px;
    width: 250px;
    outline: none;
    color: white;
    border-radius: 24px;
    transition: 0.25s
}

.box h1 {
    color: white;
    text-transform: uppercase;
    font-weight: 500
}

.box input[type="text"]:focus,
.box input[type="password"]:focus 
.box input[type="number"]:focus{
    width: 300px;
    border-color: #2ecc71
}

.box input[type="submit"] {
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #2ecc71;
    padding: 14px 40px;
    outline: none;
    color: white;
    border-radius: 24px;
    transition: 0.25s;
    cursor: pointer
}

.box input[type="submit"]:hover {
    background: #2ecc71
}

ul.social-network {
    list-style: none;
    display: inline;
    margin-left: 0 !important;
    padding: 0
}

ul.social-network li {
    display: inline;
    margin: 0 5px
}

.social-network a.icoFacebook:hover {
    background-color: #3B5998
}

.social-network a.icoTwitter:hover {
    background-color: #33ccff
}

.social-network a.icoGoogle:hover {
    background-color: #BD3518
}

.social-network a.icoFacebook:hover i,
.social-network a.icoTwitter:hover i,
.social-network a.icoGoogle:hover i {
    color: #fff
}

a.socialIcon:hover,
.socialHoverClass {
    color: #44BCDD
}

.social-circle li a {
    display: inline-block;
    position: relative;
    margin: 0 auto 0 auto;
    border-radius: 50%;
    text-align: center;
    width: 50px;
    height: 50px;
    font-size: 20px
}

.social-circle li i {
    margin: 0;
    line-height: 50px;
    text-align: center
}

.social-circle li a:hover i,
.triggeredHover {
    transform: rotate(360deg);
    transition: all 0.2s
}

.social-circle i {
    color: #fff;
    transition: all 0.8s;
    transition: all 0.8s
} 

        </style>
    </head>
    <body>
 <%
            UuserDTO user = (UuserDTO) session.getAttribute("user");
            String email = null, name="";
            int userID;
            if(user!=null){
            email = user.getEmail();            
            name=user.getName();
            userID=user.getUserID();
            
        %>

  <div class="container">
            <div class="row"> 
                <div class="col-md-6"> 
                    <div class="card"> 
                        <form action="UpdateChecker" method="Post"  class="box">
                            
                            <h1>Edit Your Profile</h1> 
                           
                            <p class="text-muted">Please Enter Your Details!</p> 
                            
                            <input type="hidden" name="userID" value="<%=user.getUserID()%>">
                            <input type="text" name="name" placeholder="Full Name" value="<%=user.getName()%>">
                            <input type="text" name="email" placeholder="EmailAddress" value="<%=user.getEmail() %>"> 
                            <input type="password" name="password" placeholder="Password" > 
                            <input type="number" name="contact" placeholder="Phone number" value="">
                            <input type="number" name="pincode" placeholder="Pincode" value="">
               
                            <input type="submit"  value="Update">
                        </form>
                            </div> 
                        
                    </div> 
                </div> 
            </div>
                            <% }%>
        </div>
    </body>
</html>

