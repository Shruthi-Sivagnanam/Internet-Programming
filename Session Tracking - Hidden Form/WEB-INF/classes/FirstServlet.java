import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        res.setContentType("text/html");

        try (PrintWriter out = res.getWriter()) {
            String username = req.getParameter("username");
            String email = req.getParameter("email");

            out.println("<form action='./second' method='post'>");
            out.println("<h1>Hi " + username + "</h1>");
            out.println("<input type='hidden' name='email' value=" + email + ">");
            out.println("<input type='submit' value='submit'>");
            out.println("</form>");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
