<%-- 
    Document   : all_newbooks
    Created on : 7 Apr, 2024, 3:12:22 PM
    Author     : Rohit
--%>

<%@page import="java.util.List"%>
<%@page import="dto.Book_details"%>
<%@page import="model.BCAbooksAuth"%>
<%@page import="dto.UuserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All New Books Page</title>
        <%@include file="all_components.jsp" %>
        <style type="text/css">
            .crd-ho:hover{
                #fcf7f7;
            }
            
            
/* toast */
#toast {
	min-width: 300px;
	position: fixed;
	bottom: 30px;
	left: 50%;
	margin-left: -125px;
	background: #333;
	padding: 10px;
	color: white;
	text-align: center;
	z-index: 1;
	font-size: 18px;
	visibility: hidden;
	box-shadow: 0px 0px 100px #000;
}

#toast.display {
	visibility: visible;
	animation: fadeIn 0.5, fadeOut 0.5s 2.5s;
}

@keyframes fadeIn {from { bottom:0;
	opacity: 0;
}

to {
	bottom: 30px;
	opacity: 1;
}

}
@keyframes fadeOut {form { bottom:30px;
	opacity: 1;
}

to {
	bottom: 0;
	opacity: 0;
}
}
        </style>
    </head>
    <div class="container text-center mt-3">
        <h1 class="btn btn-warning"><i class="fa-solid fa-cart-shopping"></i> Add More Books </h1>
    </div>
    <body>
         <%
            UuserDTO user = (UuserDTO) session.getAttribute("user");
            String email = user.getEmail();
            if(email==null)
            {
                response.sendRedirect("login.jsp");
            }
            
            
        %>
        
  
            <%@include file="all_components.jsp" %>
            
            <div class="container-fluid">
                <div class="row p-3">
                    <%
                     BCAbooksAuth auth=new BCAbooksAuth();  
             List<Book_details> list=auth.getBCABooks();
              for(Book_details b:list)
             {
                    %>
                    <div class="col-md-3">
                        <div class="card crd-ho">
                            <div class="card-body text-center">
                                <img alt="" src="image/<%=b.getBimg() %>" style="width: 100px; height: 150px" class="img-thumblin">
                                <p><%=b.getBname() %></p>
                                <p><%=b.getAuthor()%></p>
                                <p>Categories:<%=b.getBtype()%></p>
                                
                                <div class="row">
                                        <%
                            if(user==null){
                            %>
                            <a href="login.jsp" class="btn btn-danger btn-sm ml-1" >
                                <i class="fas fa-cart-plus"></i>Add Cart
                            </a>
                            <%
                            } else{
                            %>
                            <a href="CartServlet?bookID=<%=b.getBookID() %>&&userID=<%=user.getUserID() %>" class="btn btn-danger btn-sm ml-1" >
                                <i class="fas fa-cart-plus"></i>Add Cart
                            </a>
                            
                               <%
                               }
                               %>
                                    <a href="view_details.jsp" class="btn btn-success btn-sm ml-1">View Details</a>
                                    <a href="" class="btn btn-danger btn-sm ml-1">price <i class="fas fa-rupee-sign"></i><%=b.getPrice()%></a>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                    <% }%>
                </div>
            </div>
                 <div class="container text-center mt-3">
                  <a href="index.jsp" class="btn btn-primary mt-3 text-center">Home</a>
                 </div>
    </body>
</html>
