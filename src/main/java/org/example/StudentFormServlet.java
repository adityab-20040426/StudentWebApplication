package com.studentprofile;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class StudentFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        // Store the data in request attributes
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("course", course);

        // Forward to the DisplayStudentServlet to show the details
        RequestDispatcher dispatcher = request.getRequestDispatcher("displayStudent");
        dispatcher.forward(request, response);
    }
}
