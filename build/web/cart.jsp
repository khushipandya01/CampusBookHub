<%-- 
    Document   : cart
    Created on : 19 Apr, 2024, 3:24:09 PM
    Author     : Rohit
--%>

<%@page import="java.util.Iterator"%>
<%@page import="dto.CartDTO"%>
<%@page import="java.util.List"%>
<%@page import="dto.UuserDTO"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>cart Page</title>
        <%@include file="all_components.jsp"  %>
    </head>
    <body style="background-color:#f0f1f2; ">
      
        <div class="container">
            <div class="row p-2">
                <div class="col-md-6">

                    <div class="card bg-white">
                        <div class="card-body">
                            <h3 class="text-center text-success" >Your Selected item</h3>
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th scope="col">Book Name</th>
                                        <th scope="col">Author</th>
                                        <th scope="col">Price</th>
                                        <th scope="col">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        UuserDTO user=(UuserDTO)session.getAttribute("user");
                                        Cart auth=new Cart();
                                        List<CartDTO> cart=auth.getBookByUser(user.getUserID());
                                        String totalPrice="";
                                        Iterator<CartDTO> c1 = cart.iterator();
                                        CartDTO c=new CartDTO();
                                        while(c1.hasNext())
                                        {
                                            c = c1.next();
                                            totalPrice = c.getTotal_price();
                                    %>
                                    <tr>
                                        <th scope="row"><%=c.getBname() %></th>
                                        <td><%=c.getAuthor() %></td>
                                        <td><%=c.getPrice() %></td>
                                        <td>
                                            <a href="RemoveBookCart?bookID=<%=c.getBookID()%>&userID=<%=c.getUserID()%> " class="btn btn-sm btn-danger" >Remove</a>
                                        </td>
                                    </tr>
                                    <% } %>
                                        <tr>
                                        
                                        <td>Total Price</td>
                                        <td></td>
                                        <td></td>
                                        <td><%=totalPrice %></td>
                                    </tr>
<!--                                
                                    <tr>
                                        <th scope="row">3</th>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>-->
                                </tbody>
                            </table>
                        </div>

                    </div>
                </div>

                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="text-center text-success">Your details order</h3>
                            <form action="OrderServlet" method="Post">
                                <input type="hidden" value="<%=user.getUserID()%>" name="id" >
                                <input type="hidden" value="<%=c.getAuthor() %>"name="author">
                                <input type="hidden" value="<%=c.getBname() %>" name="bname" >
                                <input type="hidden" value="<%=c.getTotal_price() %>" name="totalPrice" >
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4">Name</label>
                                        <input type="text" name="name" class="form-control" id="inputEmail4" value="">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4">Email</label>
                                        <input type="email" name="email" class="form-control" id="inputPassword4" value="<%=user.getEmail() %>" readonly="readonly">
                                    </div>
                                </div>

                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4">Phone Number</label>
                                        <input type="number" name="phone" class="form-control" id="inputEmail4" required>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4">Address</label>
                                        <input type="text" name="address" class="form-control" id="inputPassword4" required>
                                    </div>
                                </div>

                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4">Landmark</label>
                                        <input type="text" name="landmark" class="form-control" id="inputEmail4" required>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4">City</label>
                                        <input type="text" name="city" class="form-control" id="inputPassword4" required>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4">State</label>
                                        <input type="text" name="state" class="form-control" id="inputEmail4" required>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4">Zip</label>
                                        <input type="number" name="pincode" class="form-control" id="inputPassword4" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Payment Mode</label>
                                    <select class="form-control" name="paymentType">
                                        <option value="noselect"> ---Select--- </option>
                                        <option value="COD"> Cash </option>
                                    </select>
                                </div>
                                
                                <div class="text-center">
                                    <a href="order_success.jsp"><button class="btn btn-warning">Order Now</button></a>
                                    <a href="index.jsp" class="btn btn-success">Continue Shopping </a>
                                     <a href="index.jsp" class="btn btn-success">Back </a>
                                    
                                </div>
                            </form>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </body>
</html>
