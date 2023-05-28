import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class About extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) {

        res.setContentType("text/html");

        try (PrintWriter out = res.getWriter()) {
            out.println("<h1><center>About</center></h1>");
            out.println(
                    "<p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Placeat autem molestias assumenda delectus dolores reprehenderit, dignissimos id rem iure? Repudiandae necessitatibus alias ipsum nihil possimus molestiae laudantium in enim commodi.</p>");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
