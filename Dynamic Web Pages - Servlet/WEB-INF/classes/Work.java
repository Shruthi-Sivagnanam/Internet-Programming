import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Work extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) {

        res.setContentType("text/html");

        try (PrintWriter out = res.getWriter()) {

            out.println("<h1><center>Work Experience</center></h1>");
            out.println("<ul>");
            out.println("<li>Project Intern in xyz company</li>");
            out.println("<li>Project Intern in abcdefe company</li>");
            out.println("<li>Working currently in zxc company</li>");
            out.println("</ul>");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
