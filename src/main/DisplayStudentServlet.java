package com.studentprofile;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DisplayStudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = (String) request.getAttribute("name");
        String email = (String) request.getAttribute("email");
        String course = (String) request.getAttribute("course");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Student Profile</h3>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Course: " + course + "</p>");
        out.println("</body></html>");
    }
}
