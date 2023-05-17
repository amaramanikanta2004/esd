import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckStatusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        int courierId = Integer.parseInt(request.getParameter("courierId"));
        
        // Perform status check logic here
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Status Check</title></head><body>");
        out.println("<h1>Status Check</h1>");
        out.println("<p>Courier ID: " + courierId + "</p>");
        out.println("<p>Status: Delivered on time</p>");
        out.println("</body></html>");
    }
}
