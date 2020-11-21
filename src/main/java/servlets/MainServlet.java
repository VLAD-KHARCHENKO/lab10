package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/cool-servlet", "/my-cool-servlet/*"})
public class MainServlet extends HttpServlet {
    private double[] Arr = new double[6];
    private String notification;
    Service service = new Service();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("notification", "result");
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Arr[0] = Double.parseDouble(req.getParameter("a1"));
        Arr[1] = Double.parseDouble(req.getParameter("b1"));
        Arr[2] = Double.parseDouble(req.getParameter("c1"));
        Arr[3] = Double.parseDouble(req.getParameter("a2"));
        Arr[4] = Double.parseDouble(req.getParameter("b2"));
        Arr[5] = Double.parseDouble(req.getParameter("c2"));

         notification = service.gaussian(Arr);

        req.setAttribute("notification", notification);
        getServletContext().getRequestDispatcher("/info.jsp").forward(req, resp);

       // resp.getWriter().write("Result:\n " + notification + "\n");

    }


}