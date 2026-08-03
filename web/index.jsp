<%-- 
    Document   : index
    Created on : 26 Mar, 2024, 11:04:24 PM
    Author     : Rohit
--%>

<%@page import="dto.UuserDTO"%>
<%@page import="model.BCAbooksAuth"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.RecentBookAuth"%>
<%@page import="java.util.List"%>
<%@page import="dto.Book_details"%>
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
        <link rel="stylesheet" href="css/card/styles.css">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    </head>
    <body>

        <%
            UuserDTO user = (UuserDTO) session.getAttribute("user");
            String email = null,name = "";
            if(user!=null)
            {
                email = user.getEmail();
                name = user.getName();
            }
        %>
        <section>

            <nav>

                <div class="logo">
                    <img src="image/logo.png">
                </div>

                <ul>
                    <li><a href="#Home">Home</a></li>
                    <li><a href="aboutUs.html">About</a></li>
                    <li>  
                        <div class="container">                                       
                            <div class="dropdown">
                                <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Books
                                    <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    <li class="dropdown-submenu">
                                        <a class="test" tabindex="-1" href="#">BCA  <span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                            <li><a tabindex="-1" href="bca1.jsp?sem=sem1">Sem 1</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=sem2">Sem 2</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=sem3">Sem 3</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=sem4">Sem 4</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=sem5">Sem 5</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=sem6">Sem 6</a></li>
                                        </ul>
                                    </li>
                                    <li class="dropdown-submenu">
                                        <a class="test" tabindex="-1" href="#">MCA <span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                            <li><a tabindex="-1" href="bca1.jsp?sem=msem1">Sem 1</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=msem2">Sem 2</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=msem3">Sem 3</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=msem4">Sem 4</a></li>
                                        </ul>
                                    </li>

                                    <li class="dropdown-submenu">
                                        <a class="test" tabindex="-1" href="#">M.sc <span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                            <li><a tabindex="-1" href="bca1.jsp?sem=mscsem1">Sem 1</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=mscsem2">Sem 2</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=mscsem3">Sem 3</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=mscsem4">Sem 4</a></li>
                                        </ul>
                                    </li>
                                    <li class="dropdown-submenu">
                                        <a class="test" tabindex="-1" href="#">Mtech <span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                            <li><a tabindex="-1" href="bca1.jsp?sem=mtechsem1">Sem 1</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=mtechsem2">Sem 2</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=mtechsem3">Sem 3</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=mtechsem4">Sem 4</a></li>
                                        </ul>
                                    </li>
                                    <li class="dropdown-submenu">
                                        <a class="test" tabindex="-1" href="#">PGDCA <span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                            <li><a tabindex="-1" href="bca1.jsp?sem=pgsem1">Sem 1</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=pgsem2">Sem 2</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=pgsem3">Sem 3</a></li>
                                            <li><a tabindex="-1" href="bca1.jsp?sem=pgsem4">Sem 4</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </div></li>

                    <script>
                        $(document).ready(function () {
                            $('.dropdown-submenu a.test').on("click", function (e) {
                                let jSubMenu = $(this).next('ul');
                                jSubMenu.toggle();
                                if (jSubMenu.length > 0) {
                                    // Close any other 'ul' elements at the same level.
                                    let jOtherSubMenus = $(this).parent().parent().find('ul');
                                    jOtherSubMenus.each(function (index, el) {
                                        let jEl = $(el);
                                        if (el != jSubMenu[0] && jEl.css('display') == 'block') {
                                            jEl.toggle();
                                        }
                                    });
                                }
                                e.stopPropagation();
                                e.preventDefault();
                            });
                        });
                    </script>
                        <% if(email!=null){%>
                        <li><a href="addbook.jsp?email=<%=user.getEmail() %>">Add Books</a></li>
                    
                    <% }%>
                <li><a href="help.jsp">Contact Us</a></li>
                   

                </ul>

                <div class="">
                    <li>  <form action="search.jsp" method="Post" class="form-inline ">
                            <input class="form-control mr-sm-2" type="search" name="ch" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                        </form></li>
                </div>
                
                
                <% if(email!=null){%>
                <a href="cart.jsp?userID=<%=user.getUserID()%>" class=""><i class="fas-fa-cart-plus fa-2x" ></i></a>
                    <%=name%>
                    <a href="cart.jsp"><i class="fa-solid fa-cart-shopping"></i></a>
                    <a href="logout.jsp" class="btn btn-primary text-white">logout</a>
                    <a href="setting.jsp"><i class="fa-solid fa-gear"></i></a>
                <% } else { %>
                
                    <div><a href="login.jsp" class="btn btn-success">SignIn</a>
                    </div>
                <%}%>

            </nav>

            <div class="main">

                <div class="main_tag">
                    <h1>Share Books<br><span>Save Trees</span></h1>

                    <p>
                        Each time a book is shared, it's like giving a second life to a tree that might otherwise have been harvested for paper. 
                        So let's cherish our books, pass them on to others, and play our part in conserving our precious natural resources. 
                        Together, through sharing, we can help save trees and create a greener, more sustainable world for future generations
                    </p>
                    <a href="#" class="main_btn">Learn More</a>

                </div>

                <div class="main_img">
                    <img src="image/table.png">

                </div>
            </div>
        </section>




        <!--Services-->

        <div class="services">

            <div class="services_box">

                <div class="services_card">
                    <i class="fa-solid fa-truck-fast"></i>
                    <h3>Fast Delivery</h3>
                    <p>
                        “Share a Book, Plant a Tree.” 
                    </p>
                </div>

                <div class="services_card">
                    <i class="fa-solid fa-headset"></i>
                    <h3>24 x 7 Services</h3>
                    <p>
                        “We’re Here When You Need Us.” 
                    </p>
                </div>

                <div class="services_card">
                    <i class="fa-solid fa-tag"></i>
                    <h3>Best Deal</h3>
                    <p>
                        “Less Paper, More Trees: Shop Smart, Save the Forests.”
                    </p>
                </div>

                <div class="services_card">
                    <i class="fa-solid fa-lock"></i>
                    <h3>Secure Payment</h3>
                    <p>
                        “Shop Confidently: Our Secure Payment Gateway Shields Your Information.”
                    </p>
                </div>

            </div>

        </div>






        <!-- Section-->

       <div class="container px-4 px-lg-5 mt-5">
            <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                <%
                    BCAbooksAuth auth = new BCAbooksAuth();
                    List<Book_details> list = auth.getBCABooks();

                    for (Book_details b : list) {

                %>
                <div class="col mb-5">
                    <div class="card h-100">
                        <!-- Sale badge-->
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                        <!-- Product image-->
                        <a href="#"><img class="card-img-top" src="image/<%=b.getBimg()%>" alt="..." /></a>
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
                            if (email == null) {
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
<!--                        <a href="view_details.jsp?bookID=""  class="btn btn-success btn-sm">View Details</a>
                        <a href="" class="btn btn-danger btn-sm"> <i class="fas fa-rupee-sign"></i></a>-->
                          <%
                            if (email == null) {
                        %>
                       
                              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center">
                                <a href="login.jsp"class="btn btn-outline-dark mt-auto">View Details</a>
                            </div>  
                        </div>
                        <%  } else { %>
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center">
                                <a href="view_details.jsp?bookID=<%=b.getBookID()%>"class="btn btn-outline-dark mt-auto">View Details</a>
                                <a href="" class="btn btn-outline-dark mt-auto"> <%=b.getPrice()%></a>
                            </div>  
                        </div>
                            <% } %>
                    </div>
                </div>
        <%
            }
        %>
            </div>
        </div>
                                 <!--BCA  ALL Books-->
            
            <div class="container px-4 px-lg-5 mt-5">
            <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
            <div class="col mb-5">
                    <div class="card h-100">
                        <!-- Sale badge-->
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                        <!-- Product image-->
                        <a href="#"><img class="card-img-top" src="image/BCA.jpg" alt="..." /></a>
                        <!-- Product details-->
                        <div class="card-body p-4">
                            <div class="text-center">
                                <!-- Product name-->
                                <a style="text-decoration: none" href="#"  <h5 class="fw-bolder"> </h5>
                                    <h5 class="fw-bolder">BCA Books</h5>
                                    <!-- Product reviews-->
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                    </div>
                                    <!-- Product price-->
                                        
                                    </a>
                            </div>
                            <!-- Product actions-->

                        </div>
                        
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                  <%
                            if (email == null) {
                        %>
                       
                              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center">
                                <a href="login.jsp"class="btn btn-outline-dark mt-auto">View All</a>
                            </div>  
                        </div><%} else { %>
                            <div class="text-center"><form action="recent.jsp"><input type="hidden" name="btype" value="BCA" >
                                    <input type="submit" class="btn btn-outline-dark mt-auto" value="View All" ></form>  </div>
                                    <%} %>
                        </div>
                    </div>
                </div>
          
            
      
            <div class="col mb-5">
                    <div class="card h-100">
                        <!-- Sale badge-->
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                        <!-- Product image-->
                        <a href="#"><img class="card-img-top" src="image/MCA.webp" alt="..." /></a>
                        <!-- Product details-->
                        <div class="card-body p-4">
                            <div class="text-center">
                                <!-- Product name-->
                                <a style="text-decoration: none" href="#"  <h5 class="fw-bolder"> </h5>
                                    <h5 class="fw-bolder">MCA Books</h5>
                                    <!-- Product reviews-->
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                    </div>
                                    <!-- Product price-->
                                        
                                    </a>
                            </div>
                            <!-- Product actions-->

                        </div>
                        
                             <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                  <%
                            if (email == null) {
                        %>
                       
                              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center">
                                <a href="login.jsp"class="btn btn-outline-dark mt-auto">View All</a>
                            </div>  
                        </div><%} else { %>
                            <div class="text-center"><form action="recent.jsp"><input type="hidden" name="btype" value="MCA" >
                                    <input type="submit" class="btn btn-outline-dark mt-auto" value="View All" ></form>  </div>
                                    <%} %>
                        </div>
                    </div>
                </div>
            
            
     
            <div class="col mb-5">
                    <div class="card h-100">
                        <!-- Sale badge-->
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                        <!-- Product image-->
                        <a href="#"><img class="card-img-top" src="image/python.webp" alt="..." /></a>
                        <!-- Product details-->
                        <div class="card-body p-4">
                            <div class="text-center">
                                <!-- Product name-->
                                <a style="text-decoration: none" href="#"  <h5 class="fw-bolder"> </h5>
                                    <h5 class="fw-bolder">Mtech Books</h5>
                                    <!-- Product reviews-->
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                    </div>
                                    <!-- Product price-->
                                        
                                    </a>
                            </div>
                            <!-- Product actions-->

                        </div>
                        
                             <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                  <%
                            if (email == null) {
                        %>
                       
                              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center">
                                <a href="login.jsp"class="btn btn-outline-dark mt-auto">View All</a>
                            </div>  
                        </div><%} else { %>
                            <div class="text-center"><form action="recent.jsp"><input type="hidden" name="btype" value="Mtech" >
                                    <input type="submit" class="btn btn-outline-dark mt-auto" value="View All" ></form>  </div>
                                    <%} %>
                        </div>
                    </div>
                </div>
           
            
         
            <div class="col mb-5">
                    <div class="card h-100">
                        <!-- Sale badge-->
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                        <!-- Product image-->
                        <a href="#"><img class="card-img-top" src="image/msc.jpg" alt="..." /></a>
                        <!-- Product details-->
                        <div class="card-body p-4">
                            <div class="text-center">
                                <!-- Product name-->
                                <a style="text-decoration: none" href="#"  <h5 class="fw-bolder"> </h5>
                                    <h5 class="fw-bolder">M.sc Books</h5>
                                    <!-- Product reviews-->
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                    </div>
                                    <!-- Product price-->
                                        
                                    </a>
                            </div>
                            <!-- Product actions-->

                        </div>
                        
                             <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                  <%
                            if (email == null) {
                        %>
                       
                              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center">
                                <a href="login.jsp"class="btn btn-outline-dark mt-auto">View All</a>
                            </div>  
                        </div><%} else { %>
                            <div class="text-center"><form action="recent.jsp"><input type="hidden" name="btype" value="Msc" >
                                    <input type="submit" class="btn btn-outline-dark mt-auto" value="View All" ></form>  </div>
                                    <%} %>
                        </div>
                    </div>
                </div>
            </div>
            </div>
           
       
    

<!-- Product actions-->
<!--                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><form action="recent.jsp"><input type="hidden" name="btype" value="cs" >
                                    <input type="submit" class="btn btn-outline-dark mt-auto" value="View All" ></form></div>
                        </div>
                    </div>
                </div>
     
                <div class="col mb-5">
                    <div class="card h-100">
                         Sale badge
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                         Product image
                        <a href="#"><img class="card-img-top" src="image/" alt="..." /></a>
                         Product details
                        <div class="card-body p-4">
                            <div class="text-center">
                                 Product name
                                <a style="text-decoration: none" href="view_details.jsp?bookID="  <h5 class="fw-bolder"></h5>
                                    <h5 class="fw-bolder">Author : </h5>
                                     Product reviews
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                    </div>
                                     Product price

                                    </a>
                            </div>
                        </div>
                         Product actions
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
                        </div>
                    </div>
                </div>-->



<!--                <div class="col mb-5">
                    <div class="card h-100">
                         Product image
                        <img class="card-img-top" src="image/book_11.jpg" alt="..." />
                         Product details
                        <div class="card-body p-4">
                            <div class="text-center">
                                 Product name
                                <h5 class="fw-bolder">MCA Books</h5>
                                 Product price
                                $120.00 - $280.00
                            </div>
                        </div>
                         Product actions
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><form action="recent.jsp"><input type="hidden" name="btype" value="cs" >
                                    <input type="submit" class="btn btn-outline-dark mt-auto" value="View All" ></form>  </div>
                        </div>
                    </div>
                </div>
                <div class="col mb-5">
                    <div class="card h-100">
                         Sale badge
                        <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                         Product image
                         <img class="card-img-top" src="image/" alt="..." />
                         Product details
                        <div class="card-body p-4">
                            <div class="text-center">
                                 Product name
                                <h5 class="fw-bolder">Cloud Computing</h5>
                                <h5 class="fw-bolder">Author : Yashwant Kantekar</h5>
                                 Product reviews
                                <div class="d-flex justify-content-center small text-warning mb-2">
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                </div>
                                 Product price

                                $18.00
                            </div>
                        </div>
                         Product actions
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
                        </div>
                    </div>
                </div>-->







<!--About-->

<div class="about">

    <div class="about_image">
        <img src="image/about.png">
    </div>
    <div class="about_tag">
        <h1>About Us</h1>
        <p>
            Welcome to the Recycle Books, your go-to destination for buying and selling textbooks conveniently.
            We're passionate about creating a seamless platform where senior students can pass on their knowledge
            to juniors while earning some extra cash in the process.
        </p>
        <a href="aboutUs.html" class="about_btn">Learn More</a>
    </div>

</div>








</body>
</html>
