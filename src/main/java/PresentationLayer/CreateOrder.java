package PresentationLayer;

import FunctionLayer.Carport;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        HttpSession session = request.getSession();

        int userId = (int) session.getAttribute("userId");

        //create order from userId and fetch orderId
        int orderId = LogicFacade.createOrder(userId);

        //cast carport object with session attribute and createcarport with new orderId
        Carport carport = (Carport) session.getAttribute("carport");
        carport.setOrderId(orderId);
        LogicFacade.saveCarport(carport);

        return "customerpage";
    }
}