package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * The type Register.
 */
public class Register extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String email = request.getParameter("email");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String fullName = request.getParameter("fullName");
        if (password1.equals(password2)) {
            User user = LogicFacade.createUser(email, password1, fullName, phone, address);
            HttpSession session = request.getSession();

            session.setAttribute("email", email);
            session.setAttribute("user", user);
            session.setAttribute("role", user.getRole());
            session.setAttribute("name", user.getFullName());
            session.setAttribute("phone", user.getPhone());
            session.setAttribute("address", user.getAddress());
            session.setAttribute("userId", user.getUserId());

            //      return user.getRole() + "page";

            switch (user.getRole()) {

                case "20":
                    return "employeepage";
                case "30":
                    return "customerpage";
                default:
                    session.setAttribute("error", "User role does not exist");
                    return "index";
            }
        } else {
            throw new LoginSampleException("the two passwords did not match");
        }
    }
}