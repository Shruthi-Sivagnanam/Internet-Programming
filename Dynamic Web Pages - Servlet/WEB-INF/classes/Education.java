import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Education extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) {

        res.setContentType("text/html");

        try (PrintWriter out = res.getWriter()) {

            out.println("<h1><center>Education</center></h1>");
            out.println("<ul>");
            out.println("<li>PG at IIT</li>");
            out.println("<li>UG at UCE BIT campus</li>");
            out.println("<li>10th and 12th at Sri Vageesha Vidyashram </li>");
            out.println("</ul>");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
