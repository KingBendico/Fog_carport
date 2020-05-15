package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Svg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Drawing extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
//        Svg svg = new Svg(800, 600, "0,0,800,600",0,0);
//        Svg svgInnerDrawing = new Svg(900,800,"0,0,900,800",0,0);
//        svg.addRect(0,0,600,780);
//        svg.addRect(0,35,4,780);
//        svg.addRect(0,565,4,780);
//        request.setAttribute("svgdrawing", svg.toString());

//        HttpSession session = request.getSession();
//        CarportFlat carportFlat = (CarportFlat) session.getAttribute("carportFlat");
//        int width = carportFlat.

        Svg svgFrame = new Svg();
        svgFrame.addFrame(); //1000 x 1000

        Svg svg = new Svg();


        // Diverse variabler
        double strapThickness = 4.5;
        int poleThickness = 10;
        double rafterThickness = 4.5;

        // Viewbox længde + 200, bredde + 200...

        // Remme / Strap
        svg.addStrap();
        // x="0" y="200" width="længde på carport" height="strapThickness";
        // x="0" y="200 + bredde på carport - 70" width="længde på carport" height="strapThickness";

        // Stolper / Pole
        // bredde 240-750
        // længde 240-780
        // hvis længde/bredde < 510 = 4 stolper
        // hvis længde/bredde > 510 = 6 stolper

        // Spær / Rafter
        //    x="0" y="0" width="45" height="bredde på carport";


        return "drawing";
    }
}