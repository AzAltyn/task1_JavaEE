package task1_4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletFormFood", value = "/ServletFormFood")
public class ServletFormFood extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String food = request.getParameter("food");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + fname + " " + lname + " ordered " + food + "</h1>");

    }
}
