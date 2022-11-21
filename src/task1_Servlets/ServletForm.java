package task1_3.Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletForm", value = "/ServletForm")
public class ServletForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome, " + fname + " " + lname + "!</h1>");

    }
}
