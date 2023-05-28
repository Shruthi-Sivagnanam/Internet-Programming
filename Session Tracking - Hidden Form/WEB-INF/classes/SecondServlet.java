import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        res.setContentType("text/html");
        String email = req.getParameter("email");

        try (PrintWriter out = res.getWriter()) {
            out.println("<h1>Hi </h1>");
            out.println("Your email id is" + email);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
