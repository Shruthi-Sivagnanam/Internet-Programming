import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

    int hitcount;

    public void init() {
        hitcount = 0;
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        res.setContentType("text/html");

        try (PrintWriter out = res.getWriter()) {

            hitcount++;

            out.println("<h1><center>Session Tracking Hit Count</center></h1>");

            out.println("<h1><center>" + hitcount + "</center></h1>");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
