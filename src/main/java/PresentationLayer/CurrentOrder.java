package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.ArrayList;

public class CurrentOrder extends Command{
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        HttpSession session = request.getSession();

        ArrayList<Order> Orders = (ArrayList)session.getAttribute("Order");
        int orderId = 0;
        for(Order o : Orders){
            if(o.getStatus()=="ACTIVE"){
                session.setAttribute("currentOrder",o);
                orderId = o.getOrderId();
            }
        }

        try {
            session.setAttribute("carport", LogicFacade.getCarport(orderId));
        } catch (SQLException ex){}

        return "showOrder";
    }
}
