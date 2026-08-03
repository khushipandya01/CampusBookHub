<%-- 
    Document   : navbar
    Created on : 30 Mar, 2024, 1:37:39 PM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="all_components.jsp" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>The Book Mediator</title>

        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>
    <body>

        <section>

            <nav>

                <div class="logo">
                    <img src="image/logo.png">
                </div>

                <ul>
                    <li><a href="#Home">Home</a></li>
                    <li><a href="#About">About</a></li>
                    <li><a href="#Featured">Recent Books</a></li>
                    <li><a href="#Arrivals">New Books</a></li>
                    <li><a href="#Reviews">Old Books</a></li>
                    <li><a href="#Blog">Contact Us</a></li>

                </ul>

                <div class="">
                    <li>  <form class="form-inline ">
                            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                        </form></li>
                </div>

            </nav>
