import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

/**
 * Created by Denis Areshkevich on 28.05.2017.
 */
@WebServlet("/")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserService();
        req.setAttribute("user", userService.getUserById(1).get());
        getServletContext().
                getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
    }

}
