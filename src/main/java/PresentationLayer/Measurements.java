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

            String carportWidth = request.getParameter("Carport_bredde");
            String carportLength = request.getParameter("Carport_laengde");
            String roof = request.getParameter("Tag");

            // only for carportFlat
            String roofPitch = request.getParameter("Taghaeldning");

            String shedWidth = request.getParameter("Redskabsrum_bredde");
            String shedLength = request.getParameter("Redskabsrum_laengde");

            session.setAttribute("carportWidth", carportWidth);
            session.setAttribute("carportLength", carportLength);
            session.setAttribute("roof", roof);

            // only for carportFlat
            session.setAttribute("roofPitch", roofPitch);

            session.setAttribute("shedWidth", shedWidth);
            session.setAttribute("shedLength", shedLength);

            //Konstruerer Carport objekter af den pågældende type
            Carport carport;
            if(Integer.parseInt(roofPitch)==0) {
                if (Integer.parseInt(shedLength) == 0) {
                    carport = new CarportFlatRoof(Integer.parseInt(carportLength), Integer.parseInt(carportWidth), 0, 0, new HashMap<>());
                    carport.setMaterialList(MaterialCalculator.MaterialList(carport));
                } else{
                    carport = new CarportFlatRoof(Integer.parseInt(carportLength), Integer.parseInt(carportWidth), Integer.parseInt(shedLength), Integer.parseInt(shedWidth), new HashMap<>());
                    carport.setMaterialList(MaterialCalculator.MaterialList(carport));
                }
            }else{
                if(Integer.parseInt(shedLength)==0){
                    carport = new CarportRaisedRoof(Integer.parseInt(carportLength), Integer.parseInt(carportWidth), 0, 0, new HashMap<>(), Integer.parseInt(roofPitch));
                    carport.setMaterialList(MaterialCalculator.MaterialList(carport));
                }else {
                    carport = new CarportRaisedRoof(Integer.parseInt(carportLength), Integer.parseInt(carportWidth), Integer.parseInt(shedLength), Integer.parseInt(shedWidth), new HashMap<>(), Integer.parseInt(roofPitch));
                    carport.setMaterialList(MaterialCalculator.MaterialList(carport));
                }
            }
            session.setAttribute("carport",carport);




            //     request.getRequestDispatcher("WEB-INF/measurements.jsp").forward(request, response);


            return "measurements";




    }




}
