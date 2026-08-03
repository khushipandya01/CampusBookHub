package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.UuserDTO;
import model.BCAbooksAuth;
import java.util.Iterator;
import model.RecentBookAuth;
import java.util.List;
import dto.Book_details;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/all_components.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>The Book Mediator</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("    integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("    integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\n");
      out.write("    integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\n");
      out.write("    integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"\n");
      out.write("    integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\"\n");
      out.write("    crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>The Book Mediator</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/card/styles.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            UuserDTO user = (UuserDTO) session.getAttribute("user");
            String email = null,name = "";
            if(user!=null)
            {
                email = user.getEmail();
                name = user.getName();
            }
        
      out.write("\n");
      out.write("        <section>\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img src=\"image/logo.png\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#Home\">Home</a></li>\n");
      out.write("                    <li><a href=\"aboutUs.html\">About</a></li>\n");
      out.write("                    <li>  \n");
      out.write("                        <div class=\"container\">                                       \n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <button class=\"btn btn-default dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Books\n");
      out.write("                                    <span class=\"caret\"></span></button>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li class=\"dropdown-submenu\">\n");
      out.write("                                        <a class=\"test\" tabindex=\"-1\" href=\"#\">BCA  <span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=sem1\">Sem 1</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=sem2\">Sem 2</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=sem3\">Sem 3</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=sem4\">Sem 4</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=sem5\">Sem 5</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=sem6\">Sem 6</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"dropdown-submenu\">\n");
      out.write("                                        <a class=\"test\" tabindex=\"-1\" href=\"#\">MCA <span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=msem1\">Sem 1</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=msem2\">Sem 2</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=msem3\">Sem 3</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=msem4\">Sem 4</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <li class=\"dropdown-submenu\">\n");
      out.write("                                        <a class=\"test\" tabindex=\"-1\" href=\"#\">M.sc <span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=mscsem1\">Sem 1</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=mscsem2\">Sem 2</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=mscsem3\">Sem 3</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=mscsem4\">Sem 4</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"dropdown-submenu\">\n");
      out.write("                                        <a class=\"test\" tabindex=\"-1\" href=\"#\">Mtech <span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=mtechsem1\">Sem 1</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=mtechsem2\">Sem 2</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=mtechsem3\">Sem 3</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=mtechsem4\">Sem 4</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"dropdown-submenu\">\n");
      out.write("                                        <a class=\"test\" tabindex=\"-1\" href=\"#\">PGDCA <span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=pgsem1\">Sem 1</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=pgsem2\">Sem 2</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=pgsem3\">Sem 3</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"bca1.jsp?sem=pgsem4\">Sem 4</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div></li>\n");
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        $(document).ready(function () {\n");
      out.write("                            $('.dropdown-submenu a.test').on(\"click\", function (e) {\n");
      out.write("                                let jSubMenu = $(this).next('ul');\n");
      out.write("                                jSubMenu.toggle();\n");
      out.write("                                if (jSubMenu.length > 0) {\n");
      out.write("                                    // Close any other 'ul' elements at the same level.\n");
      out.write("                                    let jOtherSubMenus = $(this).parent().parent().find('ul');\n");
      out.write("                                    jOtherSubMenus.each(function (index, el) {\n");
      out.write("                                        let jEl = $(el);\n");
      out.write("                                        if (el != jSubMenu[0] && jEl.css('display') == 'block') {\n");
      out.write("                                            jEl.toggle();\n");
      out.write("                                        }\n");
      out.write("                                    });\n");
      out.write("                                }\n");
      out.write("                                e.stopPropagation();\n");
      out.write("                                e.preventDefault();\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    </script>\n");
      out.write("                        ");
 if(email!=null){
      out.write("\n");
      out.write("                        <li><a href=\"addbook.jsp?email=");
      out.print(user.getEmail() );
      out.write("\">Add Books</a></li>\n");
      out.write("                    \n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                <li><a href=\"help.jsp\">Contact Us</a></li>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <li>  <form action=\"search.jsp\" method=\"Post\" class=\"form-inline \">\n");
      out.write("                            <input class=\"form-control mr-sm-2\" type=\"search\" name=\"ch\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                        </form></li>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
 if(email!=null){
      out.write("\n");
      out.write("                <a href=\"cart.jsp?userID=");
      out.print(user.getUserID());
      out.write("\" class=\"\"><i class=\"fas-fa-cart-plus fa-2x\" ></i></a>\n");
      out.write("                    ");
      out.print(name);
      out.write("\n");
      out.write("                    <a href=\"cart.jsp\"><i class=\"fa-solid fa-cart-shopping\"></i></a>\n");
      out.write("                    <a href=\"logout.jsp\" class=\"btn btn-primary text-white\">logout</a>\n");
      out.write("                    <a href=\"setting.jsp\"><i class=\"fa-solid fa-gear\"></i></a>\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                \n");
      out.write("                    <div><a href=\"login.jsp\" class=\"btn btn-success\">SignIn</a>\n");
      out.write("                    </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"main\">\n");
      out.write("\n");
      out.write("                <div class=\"main_tag\">\n");
      out.write("                    <h1>Share Books<br><span>Save Trees</span></h1>\n");
      out.write("\n");
      out.write("                    <p>\n");
      out.write("                        Each time a book is shared, it's like giving a second life to a tree that might otherwise have been harvested for paper. \n");
      out.write("                        So let's cherish our books, pass them on to others, and play our part in conserving our precious natural resources. \n");
      out.write("                        Together, through sharing, we can help save trees and create a greener, more sustainable world for future generations\n");
      out.write("                    </p>\n");
      out.write("                    <a href=\"#\" class=\"main_btn\">Learn More</a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"main_img\">\n");
      out.write("                    <img src=\"image/table.png\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Services-->\n");
      out.write("\n");
      out.write("        <div class=\"services\">\n");
      out.write("\n");
      out.write("            <div class=\"services_box\">\n");
      out.write("\n");
      out.write("                <div class=\"services_card\">\n");
      out.write("                    <i class=\"fa-solid fa-truck-fast\"></i>\n");
      out.write("                    <h3>Fast Delivery</h3>\n");
      out.write("                    <p>\n");
      out.write("                        “Share a Book, Plant a Tree.” \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"services_card\">\n");
      out.write("                    <i class=\"fa-solid fa-headset\"></i>\n");
      out.write("                    <h3>24 x 7 Services</h3>\n");
      out.write("                    <p>\n");
      out.write("                        “We’re Here When You Need Us.” \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"services_card\">\n");
      out.write("                    <i class=\"fa-solid fa-tag\"></i>\n");
      out.write("                    <h3>Best Deal</h3>\n");
      out.write("                    <p>\n");
      out.write("                        “Less Paper, More Trees: Shop Smart, Save the Forests.”\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"services_card\">\n");
      out.write("                    <i class=\"fa-solid fa-lock\"></i>\n");
      out.write("                    <h3>Secure Payment</h3>\n");
      out.write("                    <p>\n");
      out.write("                        “Shop Confidently: Our Secure Payment Gateway Shields Your Information.”\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Section-->\n");
      out.write("\n");
      out.write("       <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("            <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\n");
      out.write("                ");

                    BCAbooksAuth auth = new BCAbooksAuth();
                    List<Book_details> list = auth.getBCABooks();

                    for (Book_details b : list) {

                
      out.write("\n");
      out.write("                <div class=\"col mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <!-- Sale badge-->\n");
      out.write("                        <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
      out.write("                        <!-- Product image-->\n");
      out.write("                        <a href=\"#\"><img class=\"card-img-top\" src=\"image/");
      out.print(b.getBimg());
      out.write("\" alt=\"...\" /></a>\n");
      out.write("                        <!-- Product details-->\n");
      out.write("                        <div class=\"card-body p-4\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <!-- Product name-->\n");
      out.write("                                <a style=\"text-decoration: none\" href=\"#\"  <h5 class=\"fw-bolder\">");
      out.print(b.getBname());
      out.write(" </h5>\n");
      out.write("                                    <h5 class=\"fw-bolder\">Author : ");
      out.print(b.getAuthor());
      out.write("</h5>\n");
      out.write("                                    <!-- Product reviews-->\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Product price-->\n");
      out.write("\n");
      out.write("                                    ");
      out.print(b.getPrice());
      out.write("</a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Product actions-->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            if (email == null) {
                        
      out.write("\n");
      out.write("                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"login.jsp\">Add to cart</a></div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                        } else {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\"\n");
      out.write("                           href=\"CartServlet?bookID=");
      out.print(b.getBookID());
      out.write("&&userID=");
      out.print(user.getUserID());
      out.write(" \">Add to cart</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("<!--                        <a href=\"view_details.jsp?bookID=\"\"  class=\"btn btn-success btn-sm\">View Details</a>\n");
      out.write("                        <a href=\"\" class=\"btn btn-danger btn-sm\"> <i class=\"fas fa-rupee-sign\"></i></a>-->\n");
      out.write("                          ");

                            if (email == null) {
                        
      out.write("\n");
      out.write("                       \n");
      out.write("                              <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <a href=\"login.jsp\"class=\"btn btn-outline-dark mt-auto\">View Details</a>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                        ");
  } else { 
      out.write("\n");
      out.write("                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <a href=\"view_details.jsp?bookID=");
      out.print(b.getBookID());
      out.write("\"class=\"btn btn-outline-dark mt-auto\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-outline-dark mt-auto\"> ");
      out.print(b.getPrice());
      out.write("</a>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                                 <!--BCA  ALL Books-->\n");
      out.write("            \n");
      out.write("            <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("            <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\n");
      out.write("            <div class=\"col mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <!-- Sale badge-->\n");
      out.write("                        <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
      out.write("                        <!-- Product image-->\n");
      out.write("                        <a href=\"#\"><img class=\"card-img-top\" src=\"image/BCA.jpg\" alt=\"...\" /></a>\n");
      out.write("                        <!-- Product details-->\n");
      out.write("                        <div class=\"card-body p-4\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <!-- Product name-->\n");
      out.write("                                <a style=\"text-decoration: none\" href=\"#\"  <h5 class=\"fw-bolder\"> </h5>\n");
      out.write("                                    <h5 class=\"fw-bolder\">BCA Books</h5>\n");
      out.write("                                    <!-- Product reviews-->\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Product price-->\n");
      out.write("                                        \n");
      out.write("                                    </a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Product actions-->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                  ");

                            if (email == null) {
                        
      out.write("\n");
      out.write("                       \n");
      out.write("                              <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <a href=\"login.jsp\"class=\"btn btn-outline-dark mt-auto\">View All</a>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>");
} else { 
      out.write("\n");
      out.write("                            <div class=\"text-center\"><form action=\"recent.jsp\"><input type=\"hidden\" name=\"btype\" value=\"BCA\" >\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-outline-dark mt-auto\" value=\"View All\" ></form>  </div>\n");
      out.write("                                    ");
} 
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("      \n");
      out.write("            <div class=\"col mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <!-- Sale badge-->\n");
      out.write("                        <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
      out.write("                        <!-- Product image-->\n");
      out.write("                        <a href=\"#\"><img class=\"card-img-top\" src=\"image/MCA.webp\" alt=\"...\" /></a>\n");
      out.write("                        <!-- Product details-->\n");
      out.write("                        <div class=\"card-body p-4\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <!-- Product name-->\n");
      out.write("                                <a style=\"text-decoration: none\" href=\"#\"  <h5 class=\"fw-bolder\"> </h5>\n");
      out.write("                                    <h5 class=\"fw-bolder\">MCA Books</h5>\n");
      out.write("                                    <!-- Product reviews-->\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Product price-->\n");
      out.write("                                        \n");
      out.write("                                    </a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Product actions-->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                             <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                  ");

                            if (email == null) {
                        
      out.write("\n");
      out.write("                       \n");
      out.write("                              <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <a href=\"login.jsp\"class=\"btn btn-outline-dark mt-auto\">View All</a>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>");
} else { 
      out.write("\n");
      out.write("                            <div class=\"text-center\"><form action=\"recent.jsp\"><input type=\"hidden\" name=\"btype\" value=\"MCA\" >\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-outline-dark mt-auto\" value=\"View All\" ></form>  </div>\n");
      out.write("                                    ");
} 
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("     \n");
      out.write("            <div class=\"col mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <!-- Sale badge-->\n");
      out.write("                        <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
      out.write("                        <!-- Product image-->\n");
      out.write("                        <a href=\"#\"><img class=\"card-img-top\" src=\"image/python.webp\" alt=\"...\" /></a>\n");
      out.write("                        <!-- Product details-->\n");
      out.write("                        <div class=\"card-body p-4\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <!-- Product name-->\n");
      out.write("                                <a style=\"text-decoration: none\" href=\"#\"  <h5 class=\"fw-bolder\"> </h5>\n");
      out.write("                                    <h5 class=\"fw-bolder\">Mtech Books</h5>\n");
      out.write("                                    <!-- Product reviews-->\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Product price-->\n");
      out.write("                                        \n");
      out.write("                                    </a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Product actions-->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                             <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                  ");

                            if (email == null) {
                        
      out.write("\n");
      out.write("                       \n");
      out.write("                              <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <a href=\"login.jsp\"class=\"btn btn-outline-dark mt-auto\">View All</a>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>");
} else { 
      out.write("\n");
      out.write("                            <div class=\"text-center\"><form action=\"recent.jsp\"><input type=\"hidden\" name=\"btype\" value=\"Mtech\" >\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-outline-dark mt-auto\" value=\"View All\" ></form>  </div>\n");
      out.write("                                    ");
} 
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("         \n");
      out.write("            <div class=\"col mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <!-- Sale badge-->\n");
      out.write("                        <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
      out.write("                        <!-- Product image-->\n");
      out.write("                        <a href=\"#\"><img class=\"card-img-top\" src=\"image/msc.jpg\" alt=\"...\" /></a>\n");
      out.write("                        <!-- Product details-->\n");
      out.write("                        <div class=\"card-body p-4\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <!-- Product name-->\n");
      out.write("                                <a style=\"text-decoration: none\" href=\"#\"  <h5 class=\"fw-bolder\"> </h5>\n");
      out.write("                                    <h5 class=\"fw-bolder\">M.sc Books</h5>\n");
      out.write("                                    <!-- Product reviews-->\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Product price-->\n");
      out.write("                                        \n");
      out.write("                                    </a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Product actions-->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                             <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                  ");

                            if (email == null) {
                        
      out.write("\n");
      out.write("                       \n");
      out.write("                              <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <a href=\"login.jsp\"class=\"btn btn-outline-dark mt-auto\">View All</a>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>");
} else { 
      out.write("\n");
      out.write("                            <div class=\"text-center\"><form action=\"recent.jsp\"><input type=\"hidden\" name=\"btype\" value=\"Msc\" >\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-outline-dark mt-auto\" value=\"View All\" ></form>  </div>\n");
      out.write("                                    ");
} 
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("       \n");
      out.write("    \n");
      out.write("\n");
      out.write("<!-- Product actions-->\n");
      out.write("<!--                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\"><form action=\"recent.jsp\"><input type=\"hidden\" name=\"btype\" value=\"cs\" >\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-outline-dark mt-auto\" value=\"View All\" ></form></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("     \n");
      out.write("                <div class=\"col mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                         Sale badge\n");
      out.write("                        <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
      out.write("                         Product image\n");
      out.write("                        <a href=\"#\"><img class=\"card-img-top\" src=\"image/\" alt=\"...\" /></a>\n");
      out.write("                         Product details\n");
      out.write("                        <div class=\"card-body p-4\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                 Product name\n");
      out.write("                                <a style=\"text-decoration: none\" href=\"view_details.jsp?bookID=\"  <h5 class=\"fw-bolder\"></h5>\n");
      out.write("                                    <h5 class=\"fw-bolder\">Author : </h5>\n");
      out.write("                                     Product reviews\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                     Product price\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         Product actions\n");
      out.write("                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--                <div class=\"col mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                         Product image\n");
      out.write("                        <img class=\"card-img-top\" src=\"image/book_11.jpg\" alt=\"...\" />\n");
      out.write("                         Product details\n");
      out.write("                        <div class=\"card-body p-4\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                 Product name\n");
      out.write("                                <h5 class=\"fw-bolder\">MCA Books</h5>\n");
      out.write("                                 Product price\n");
      out.write("                                $120.00 - $280.00\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         Product actions\n");
      out.write("                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\"><form action=\"recent.jsp\"><input type=\"hidden\" name=\"btype\" value=\"cs\" >\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-outline-dark mt-auto\" value=\"View All\" ></form>  </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                         Sale badge\n");
      out.write("                        <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\n");
      out.write("                         Product image\n");
      out.write("                         <img class=\"card-img-top\" src=\"image/\" alt=\"...\" />\n");
      out.write("                         Product details\n");
      out.write("                        <div class=\"card-body p-4\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                 Product name\n");
      out.write("                                <h5 class=\"fw-bolder\">Cloud Computing</h5>\n");
      out.write("                                <h5 class=\"fw-bolder\">Author : Yashwant Kantekar</h5>\n");
      out.write("                                 Product reviews\n");
      out.write("                                <div class=\"d-flex justify-content-center small text-warning mb-2\">\n");
      out.write("                                    <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    <div class=\"bi-star-fill\"></div>\n");
      out.write("                                    <div class=\"bi-star-fill\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                 Product price\n");
      out.write("\n");
      out.write("                                $18.00\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         Product actions\n");
      out.write("                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                            <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--About-->\n");
      out.write("\n");
      out.write("<div class=\"about\">\n");
      out.write("\n");
      out.write("    <div class=\"about_image\">\n");
      out.write("        <img src=\"image/about.png\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"about_tag\">\n");
      out.write("        <h1>About Us</h1>\n");
      out.write("        <p>\n");
      out.write("            Welcome to the Recycle Books, your go-to destination for buying and selling textbooks conveniently.\n");
      out.write("            We're passionate about creating a seamless platform where senior students can pass on their knowledge\n");
      out.write("            to juniors while earning some extra cash in the process.\n");
      out.write("        </p>\n");
      out.write("        <a href=\"aboutUs.html\" class=\"about_btn\">Learn More</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
