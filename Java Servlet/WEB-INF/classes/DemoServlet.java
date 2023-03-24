import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<p>Username : " + req.getParameter("username") + "</p><br/>" + "<p>Email : "
                + req.getParameter("email")
                + "</p>");
    }
}
