import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aServlet")
public class Controller extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException {
        Cookie cookie = new Cookie("name", "value");
        resp.addCookie(cookie);

    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException {
        Cookie [] cookies = req.getCookies();
        for(Cookie cookie: cookies) {
            String name = cookie.getName();
            if(name.equals("name")) {
                String value = cookie.getValue();
                System.out.println(value);
                break;
            }
        }
        return ;
    }

}
