package PresentationLayer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

import FunctionLayer.*;

// @WebServlet(name = "Measurements", urlPatterns = {"/Measurements"})
public class Measurements extends Command {

    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        HttpSession session = request.getSession();

        session.setAttribute("carportWidth", request.getParameter("Carport_bredde"));
        session.setAttribute("carportLength", request.getParameter("Carport_laengde"));
        session.setAttribute("roof", request.getParameter("Tag"));

        // only for carportFlat
        session.setAttribute("roofPitch", request.getParameter("Taghaeldning"));
        session.setAttribute("shedWidth", request.getParameter("Redskabsrum_bredde"));
        session.setAttribute("shedLength", request.getParameter("Redskabsrum_laengde"));

        int id = 0;
        int carportWidth = 0;
        int carportLength = 0;
        int roof = 0;
        int roofPitch = 0;
        int shedWidth = 0;
        int shedLength = 0;
        try {
            carportWidth = Integer.parseInt(request.getParameter("Carport_bredde"));
            carportLength = Integer.parseInt(request.getParameter("Carport_laengde"));
            roof = Integer.parseInt(request.getParameter("Tag"));
            // only for carportFlat
            roofPitch = Integer.parseInt(request.getParameter("Taghaeldning"));
            shedWidth = Integer.parseInt(request.getParameter("Redskabsrum_bredde"));
            shedLength = Integer.parseInt(request.getParameter("Redskabsrum_laengde"));
        } catch (NumberFormatException ex) {
        }

        //Konstruerer Carport objekter af den pågældende type
        Carport carport = Carport.createCarport(0, 0, carportLength, carportWidth, shedLength, shedWidth, roofPitch);
        session.setAttribute("carport", carport);
        Svg svg = SvgDrawing.drawMyCarport(carport);
        session.setAttribute("svgdrawing", svg.toString());

        return "measurements";
    }
}
