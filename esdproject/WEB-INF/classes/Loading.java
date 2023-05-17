import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoadCourierServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        int courierId = Integer.parseInt(request.getParameter("courierId"));
        String driver = request.getParameter("driver");
        String vehicle = request.getParameter("vehicle");
        
        // Perform loading logic here
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Load Confirmation</title></head><body>");
        out.println("<h1>Load Confirmation</h1>");
        out.println("<p>Courier ID: " + courierId + "</p>");
        out.println("<p>Driver Name: " + driver + "</p>");
        out.println("<p>Vehicle Number: " + vehicle + "</p>");
        out.println("<p>Load Confirmed!</p>");
        out.println("</body></html>");
    }
}
