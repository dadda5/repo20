import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TourismServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Indian Tourism</title></head><body>");
        out.println("<h1>Welcome to Incredible India Tourism</h1>");

        out.println("<p>India is a land of diverse cultures, traditions, and landscapes. "
                + "From the Himalayas in the north to the beaches of Goa in the south, "
                + "India offers a wide range of tourist attractions.</p>");

        out.println("<h2>Popular Tourist Places:</h2>");
        out.println("<ul>");
        out.println("<li>Taj Mahal - Agra</li>");
        out.println("<li>Jaipur - Pink City</li>");
        out.println("<li>Kerala Backwaters</li>");
        out.println("<li>Goa Beaches</li>");
        out.println("</ul>");

        out.println("<h2>Prime Minister of India</h2>");
        out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/9/9e/Narendra_Modi_2023.jpg' width='300'/>");

        out.println("<p>India is currently led by Prime Minister Narendra Modi, who promotes tourism through initiatives like 'Incredible India'.</p>");

        out.println("</body></html>");
    }
}
