import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: b3053632
 * Date: 03/12/13
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RegisterItems register = new RegisterItems();
        LoginItems login = new LoginItems();

        String username = req.getParameter("username");
        register.setUsername(username);
        System.out.println("username " + register.getUsername());

        String pass = req.getParameter("password");
        register.setPassword(pass);

        String email =req.getParameter("email");
        register.setEmail(email);

        String dob = req.getParameter("dateOfBirth");
        register.setDob(dob);



        login.setUsername(username);
        login.setPassword(pass);

        System.out.println("set user n password");
        DataStore.regItems.put(username, register);
        DataStore.logItems.put(username, login);
        System.out.println("Storing in login items, " + username);






        // super.doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
