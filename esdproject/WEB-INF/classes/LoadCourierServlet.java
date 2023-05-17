import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoadCourierServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Load Courier</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Load Courier</h1>");
        out.println("<form method=\"post\" action=\"loadCourier\">");
        out.println("<label for=\"courierId\">Courier ID:</label>");
        out.println("<input type=\"text\" id=\"courierId\" name=\"courierId\"><br><br>");
        out.println("<label for=\"driver\">Driver Name:</label>");
        out.println("<input type=\"text\" id=\"driver\" name=\"driver\"><br><br>");
        out.println("<label for=\"vehicle\">Vehicle Number:</label>");
        out.println("<input type=\"text\" id=\"vehicle\" name=\"vehicle\"><br><br>");
        out.println("<input type=\"submit\" value=\"Load Courier\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle form submission and database insertion here
    }

}
