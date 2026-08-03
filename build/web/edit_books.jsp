<%-- 
    Document   : edit_books
    Created on : 29 Mar, 2024, 3:01:57 PM
    Author     : Rohit
--%>


<%@page import="controller.Edit_BookServlet"%>
<%@page import="dto.Book_details"%>
<%@page import="model.Edit_BooksAuth"%>
 <%@include file="all_components.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit books </title>
    </head>
   
    <body style="background-color: #f0f2f2;">
       
        <div class="container ">
            <div class="row ">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">Edit Books</h4>
                       
                             <% 
                                 String id=request.getParameter("id");
                              Edit_BooksAuth auth=new Edit_BooksAuth();
                              Book_details b1=auth.getBookById(id);
                             %>
                                
                            <form action="Edit_BookServlet" method="Post" >
                                <input type="hidden" name="id" value="<%=b1.getBookID() %>"
                                <div class="form-group">
                                    <label for="exampleInputEmail">Book Name</label>
                                    <input name="bname" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"value="<%=b1.getBname() %>">
                                </div>
                               
                                
                                  <div class="form-group">
                                    <label for="exampleInputEmail">Author Name</label>
                                    <input name="author" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=b1.getAuthor() %>">
                                </div>
                                
                                  <div class="form-group">
                                    <label for="exampleInputEmail">price</label>
                                    <input name="price" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=b1.getPrice() %>">
                                </div>
                                
                                  <div class="form-group">
                                      <label for="exampleInputEmail">Book Categories</label><select
                                     name="btype"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=b1.getBtype() %>">
                                          <option selected>--select---</option>
                                          <option value="BCA">BCA Book</option>
                                          <option value="MCA">MCA Book</option>
                                      </select>
                                  </div>
                                
                                    <div class="form-group">
                                        <label for="exampleInputEmail">Book Status</label><select
                                     name="bstatus"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                          <% if("Active".equals(b1.getBstatus())){
                                              %>
                                               <option value="Active">Active</option>
                                         <% } else {%>
                                          
                                          <option value="Inactive">Inactive</option>
                                          <%}%></select>
                                    </div>
                               
                               
                                <input type="submit" value="Edit" class="btn btn-primary" >
                                    
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

