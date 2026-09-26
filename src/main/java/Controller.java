import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name =request.getParameter("uname");
        String Email = request.getParameter("email");
        String upassword =request.getParameter("pass");
        String city = request.getParameter("ucity");

        Model model = new Model();
        model.setEmail(Email);
        model.setPassword(upassword);
        model.setUname(name);
        model.setUcity(city);

        int rowaffected = model.register();

        HttpSession session = request.getSession();
        session.setAttribute("name",name);

        if(rowaffected == 0){
            response.sendRedirect("/Registration_using_MVC/failure.jsp");
        }else{
            response.sendRedirect("/Registration_using_MVC/success.jsp");
        }

    }
}
