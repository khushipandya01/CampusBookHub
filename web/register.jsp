<%-- 
    Document   : register
    Created on : 26 Mar, 2024, 11:10:35 PM
    Author     : Rohit
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
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
 

  <div class="container">
            <div class="row"> 
                <div class="col-md-6"> 
                    <div class="card"> 
                        <form action="RegistrationChecker" method="Post" class="box">
                            
                            <h1>Registration</h1> 
                          
                            <p class="text-muted">Please Enter Your Details!</p> 
                            <input type="text" name="name" placeholder="Full Name">
                            <input type="text" name="email" placeholder="EmailAddress"> 
                            <input type="password" name="password" placeholder="Password"> 
                            <input type="number" name="contact" placeholder="Phone number">
                            <input type="number" name="pincode" placeholder="Pincode">
                             <div class="mb-2">
                <label class="option">Check me Out
                    <input type="checkbox" checked>
                    <span class="checkmark"></span>
                </label>
            </div> 
                            <input type="submit"  value="SignUp"> 
                             <div class="terms mb-2">
                By clicking "Signup", you acknowledge that you have read the
                <a href="#">Privacy Policy</a> and agree to the
                <a href="#">Terms of Service</a>.
            </div>
                            <a href="login.jsp">SignIn</a>
                            <div class="col-md-12"> <ul class="social-network social-circle"> 
                                    <li><a href="#" class="icoFacebook" title="Facebook">
                                            <i class="fab fa-facebook-f"></i></a>
                                    </li> <li><a href="#" class="icoTwitter" title="Twitter">
                                            <i class="fab fa-twitter"></i></a></li>
                                            <li><a href="#" class="icoGoogle" title="Google +">
                                                    <i class="fab fa-google-plus"></i></a></li> 
                                </ul> 
                            </div> 
                        </form>
                    </div> 
                </div> 
            </div>
        </div>
    </body>
</html>
