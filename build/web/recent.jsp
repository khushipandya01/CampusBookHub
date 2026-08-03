<%-- 
    Document   : recent
    Created on : 2 Apr, 2024, 8:19:18 PM
    Author     : Rohit
--%>
<%@page import="dto.UuserDTO"%>
<%@page import="java.util.Iterator"%>
<%@include file="all_components.jsp" %>
<%@page import="java.util.List"%>
<%@page import="dto.Book_details"%>
<%@page import="model.RecentBookAuth"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All recent Books</title>
        <link rel="stylesheet" href="css/card/styles.css">
    </head>
    <body>
  <%
            UuserDTO user = (UuserDTO) session.getAttribute("user");
            String email = user.getEmail();
            if(email==null)
            {
                response.sendRedirect("login.jsp");
            }
            
            
        %>
         <div class="container px-4 px-lg-5 mt-5">
            <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
        <%
            String btype = request.getParameter("btype");
            RecentBookAuth auth = new RecentBookAuth(btype);
            List<Book_details> list = auth.getAllRecentBooks();
            

            Iterator<Book_details> i = list.iterator();
            while (i.hasNext()) {
                Book_details b = i.next();
                System.out.println(b.getAuthor());
        %>
       
                <div class="col mb-5">
                    <div class="card h-100">
                        <!-- Sale badge-->
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                        <!-- Product image-->
                        <a href="view_details.jsp?bookID=<%= b.getBookID() %>"><img class="card-img-top" src="image/<%=b.getBimg()%>" alt="..." /></a>
                        <!-- Product details-->
                        <div class="card-body p-4">
                            <div class="text-center">
                                <!-- Product name-->
                                <a style="text-decoration: none" href="#"  <h5 class="fw-bolder"><%=b.getBname()%> </h5>
                                    <h5 class="fw-bolder">Author : <%=b.getAuthor()%></h5>
                                    <!-- Product reviews-->
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                    </div>
                                    <!-- Product price-->

                                    <%=b.getPrice()%></a>
                            </div>
                                                 <!-- Product actions-->
               
                </div>
                                                   <%
                            if (user == null) {
                        %>
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="login.jsp">Add to cart</a></div>
                        </div>
                        <%
                        } else {
                        %>

                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto"
                           href="CartServlet?bookID=<%=b.getBookID()%>&&userID=<%=user.getUserID()%> ">Add to cart</a>
                            </div>
                        </div>

                        <%
                            }
                        %>
                </div>
                </div>
                        <%}%>
                    
        </div>
         </div>    
                
    </body>
</html>
