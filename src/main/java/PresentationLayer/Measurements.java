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
        String flatMeasurements = request.getParameter("flatMeasurements");
        String raisedMeasurements = request.getParameter("raisedMeasurements");

        int id = 0;
        int orderId = 0;
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
        }catch (NumberFormatException ex) {}


            //Konstruerer Carport objekter af den pågældende type
            Carport carport;
            if(roofPitch==0) {
                if (shedLength == 0) {
                    carport = new CarportFlatRoof(id, orderId, carportLength, carportWidth, 0, 0, new HashMap<>());
                    carport.setMaterialList(MaterialCalculator.MaterialList(carport));
                } else{
                    carport = new CarportFlatRoof(id, orderId, carportLength, carportWidth, shedLength, shedWidth, new HashMap<>());
                    carport.setMaterialList(MaterialCalculator.MaterialList(carport));
                }
            }else{
                if(shedLength == 0){
                    carport = new CarportRaisedRoof(id, orderId, carportLength, carportWidth, 0, 0, new HashMap<>(), roofPitch);
                    carport.setMaterialList(MaterialCalculator.MaterialList(carport));
                }else {
                    carport = new CarportRaisedRoof(id, orderId, carportLength, carportWidth, shedLength, shedWidth, new HashMap<>(), roofPitch);
                    carport.setMaterialList(MaterialCalculator.MaterialList(carport));
                }
            }
            session.setAttribute("carport",carport);

            session.setAttribute("carportWidth", request.getParameter("Carport_bredde"));
            session.setAttribute("carportLength", request.getParameter("Carport_laengde"));
            session.setAttribute("roof", request.getParameter("Tag"));

            // only for carportFlat
            session.setAttribute("roofPitch", request.getParameter("Taghaeldning"));

            session.setAttribute("shedWidth", request.getParameter("Redskabsrum_bredde"));
            session.setAttribute("shedLength", request.getParameter("Redskabsrum_laengde"));



            //     request.getRequestDispatcher("WEB-INF/measurements.jsp").forward(request, response);


            return "measurements";




    }




}
