package task1_2.Servlets;

import task1_2.Class.HR;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "ServletArray", value = "/ServletArray")
public class ServletArray extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<HR> hrs = new ArrayList<>();
        hrs.add(new HR("Ilyas", "Zhuanyshev", "IT", 550000));
        hrs.add(new HR("Aybek", "Bagit", "Management", 650000));
        hrs.add(new HR("Alibek", "Serikov", "HR", 350000));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<table><tr style = 'background-color: grey'><th>NAME</th><th>SURNAME</th><th>DEPARTMENT</th><th>SALARY</th></tr>");
        for (HR hr: hrs){
            out.println("<tr><td>" + hr.getName() + "</td><td>" + hr.getSurname() + "</td><td>" + hr.getDepartment() +
                            "</td><td>" + hr.getSalary() +
                    "</td></tr>");
        }
        out.println("</table>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
