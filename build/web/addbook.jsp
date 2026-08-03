<%-- 
    Document   : addbook
    Created on : 27 Mar, 2024, 11:13:44 PM
    Author     : Rohit
--%>

<%@page import="dto.UuserDTO"%>
<%@include file="all_components.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Add Book Page</title>
    </head>
    <body style="background-color: #f0f2f2;">
           <%
            UuserDTO user = (UuserDTO) session.getAttribute("user");
            String email = null;
            if(user!=null)
            email = user.getEmail();            
            
        %>
        <div class="container">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">Add Books</h4>

                                
                            <form action="Addbook" method="Post" enctype="multipart/form-data">
                                <input type="hidden" name="email" value="<%=user.getEmail()%>">
                                <div class="form-group">
                                    <label for="exampleInputEmail">Book Name</label>
                                    <input name="bname" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                </div>
                                
                                  <div class="form-group">
                                    <label for="exampleInputEmail">Author Name</label>
                                    <input name="author" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                </div>
                                
                                  <div class="form-group">
                                    <label for="exampleInputEmail">price</label>
                                    <input name="price" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                </div>
                                
                                  <div class="form-group">
                                      <label for="exampleInputEmail">Book Categories</label><select
                                     name="btype"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                          <option selected>--select---</option>
                                          <option value="BCA">BCA Book</option>
                                          <option value="MCA">MCA Book</option>
                                          <option value="Mtech">Mtech Book</option>
                                          <option value="M.sc">M.sc Book</option>
                                          <option value="MBA">MBA Book</option>
                                          </select>
                                </div>
                                
                                    <div class="form-group">
                                      <label for="exampleInputEmail">Book Status</label><select
                                     name="bstatus"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                          <option selected>--select---</option>
                                          <option value="Active">Active</option>
                                          <option value="Inactive">Inactive</option>
                                </div>
                                    
                                    <div class="form-group">
                                      <label for="exampleInputEmail">Upload Photo</label><input
                                     name="bimg" type="file" class="form-control" id="exampleFormControlFile1" aria-describedby="emailHelp">
                                         
                                </div>
                               
                                <input type="submit" value="submit" class="btn btn-primary" >
                                    
                            </form>
                                 <div class="container text-center mt-3">
                                     <a href="setting.jsp" class="btn btn-warning text-center">Back</a>
                 </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
