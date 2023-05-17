import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CourierBookingServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Courier Booking</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Courier Booking</h1>");
        out.println("<form method=\"post\" action=\"submit\">");
        out.println("<label for=\"sender\">Sender:</label>");
        out.println("<input type=\"text\" id=\"sender\" name=\"sender\"><br><br>");
        out.println("<label for=\"receiver\">Receiver:</label>");
        out.println("<input type=\"text\" id=\"receiver\" name=\"receiver\"><br><br>");
        out.println("<label for=\"weight\">Weight:</label>");
        out.println("<input type=\"text\" id=\"weight\" name=\"weight\"><br><br>");
        out.println("<label for=\"pickup\">Pickup Location:</label>");
        out.println("<input type=\"text\" id=\"pickup\" name=\"pickup\"><br><br>");
        out.println("<label for=\"delivery\">Delivery Location:</label>");
        out.println("<input type=\"text\" id=\"delivery\" name=\"delivery\"><br><br>");
        out.println("<label for=\"deadline\">Delivery Deadline:</label>");
        out.println("<input type=\"text\" id=\"deadline\" name=\"deadline\"><br><br>");
        out.println("<input type=\"submit\" value=\"Book Courier\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle form submission and database insertion here
    }

}
