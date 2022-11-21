package task1_5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1_5", value = "/Servlet1_5")
public class Servlet1_5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fname = request.getParameter("fname");
        int age = Integer.parseInt(request.getParameter("quantity"));
        String gen = request.getParameter("fav_language");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (age>=18){
            if (gen.equals("male")){
                out.println("<h1>Hello Dear Mister " + fname + "!</h1>");
            }else
                out.println("<h1>Hello Dear Miss " + fname + "!</h1>");
        }else {
            if (gen.equals("male")){
                out.println("<h1>Hello Dude Mister " + fname + "!</h1>");
            }else
                out.println("<h1>Hello Dude Miss " + fname + "!</h1>");
        }
        out.println("<h3>" + gen + "</h3>");
    }
}
