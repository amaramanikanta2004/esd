import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookCourierServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String sender = request.getParameter("sender");
        String receiver = request.getParameter("receiver");
        double weight = Double.parseDouble(request.getParameter("weight"));
        String pickup = request.getParameter("pickup");
        String delivery = request.getParameter("delivery");
        String deadline = request.getParameter("deadline");
        
        // Perform booking logic here
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Booking Confirmation</title></head><body>");
        out.println("<h1>Booking Confirmation</h1>");
        out.println("<p>Sender Name: " + sender + "</p>");
        out.println("<p>Receiver Name: " + receiver + "</p>");
        out.println("<p>Weight: " + weight + " kg</p>");
        out.println("<p>Pickup Location: " + pickup + "</p>");
        out.println("<p>Delivery Location: " + delivery + "</p>");
        out.println("<p>Delivery Deadline: " + deadline + "</p>");
        out.println("<p>Booking Confirmed!</p>");
        out.println("</body></html>");
    }
}
