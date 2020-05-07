package PresentationLayer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.MaterialCalculator;
import FunctionLayer.Materials;

// @WebServlet(name = "Measurements", urlPatterns = {"/Measurements"})
public class Measurements extends Command {

    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        HttpSession session = request.getSession();
        HashMap<Integer, Materials> MaterialList = MaterialCalculator.MaterialList();
        MaterialList.toString();
        //Her skal MaterialList genneløbes og printes pænt.



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



            //     request.getRequestDispatcher("WEB-INF/measurements.jsp").forward(request, response);


            return "measurements";




    }




}
