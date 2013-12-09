import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: b3053632
 * Date: 04/12/13
 * Time: 13:56
 * To change this template use File | Settings | File Templates.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(true);

        LoginItems login = new LoginItems();

        String username = req.getParameter("username");
        login.setUsername(username);

        String pass = req.getParameter("password");
        login.setPassword(pass);
        //System.out.println("");
        if (DataStore.logItems.containsKey(username) && DataStore.logItems.get(username).getPassword().equals(pass)
               /*&& session.getAttribute("username") == null*/) {

              System.out.println("1st if");
            if(session.getAttribute("username") == null)    {
                session.setAttribute("user", username);
                System.out.println("inside if");
                resp.sendRedirect("account");
            }
            else
                System.out.println("wrong else");

        } else {
            req.setAttribute("userNotPresent", true);
            req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
        }
    }




	/*if(DataStore.logItems.containsKey(username)){
            System.out.println("inside if");
            resp.sendRedirect("account");
        }*/

    //req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
    //super.doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
}


