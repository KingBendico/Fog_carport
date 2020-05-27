package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.ArrayList;


public class Login extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = LogicFacade.login(email, password);

        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        session.setAttribute("role", user.getRole());
        session.setAttribute("email", email);
        session.setAttribute("user", user);
        session.setAttribute("role", user.getRole());
        session.setAttribute("email", email);
        session.setAttribute("name", user.getFullName());
        session.setAttribute("phone", user.getPhone());
        session.setAttribute("address", user.getAddress());
        session.setAttribute("userId", user.getUserId());

        //Array til alle ordre denne kunde har
        ArrayList<Order> Orders = new ArrayList<>();
        try {
            Orders = LogicFacade.getPreviousOrders(user.getUserId());
        } catch (SQLException ex) {
        }

        session.setAttribute("Orders", Orders);

        //    return user.getRole() + "page";
        switch (user.getRole()) {
            case "10":
                return "adminpage";
            case "20":
                return "employeepage";
            case "30":
                return "customerpage";
            default:
                session.setAttribute("error", "User role does not exist");
                return "index";
        }
    }
}