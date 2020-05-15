package PresentationLayer;

import FunctionLayer.Carport;
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
//        request.setAttribute("svgdrawing", svg.toString());

        HttpSession session = request.getSession();
        Carport carport = (Carport) session.getAttribute("carport");

        Svg svgFrame = new Svg();
        svgFrame.addFrame(); //1000 x 1000

        Svg svg = new Svg();

        // Diverse variabler
        int strapThickness = 4;     //4.5 som double ?
        int poleThickness = 10;
        int rafterThickness = 4;    //4.5 som double ?
        int rafterDistance = 55;

        // Remme / Strap
        svg.addStrap(0,100, carport.getLength(), strapThickness);
        svg.addStrap(0,carport.getWidth()-200, carport.getLength(), strapThickness);

        // Spær / Rafter
        svg.addRafter(0,0,rafterThickness,carport.getWidth());
        for(int i = 0; i < carport.getLength(); i = i + rafterDistance){
            svg.addRafter(0,0,rafterThickness,carport.getWidth()); // X SKAL ÆNDRES !!!!!!!!!!!!!!!
        }

        // Stolper / Pole                   // bredde 240-750   // længde 240-780
        svg.addPole(140,140,poleThickness, poleThickness);

        // hvis længde/bredde < 510 = 4 stolper
        // hvis længde/bredde > 510 = 6 stolper



        // Viewbox længde + 200, bredde + 200...

        request.setAttribute("svgdrawing", svg.toString());

        return "drawing";
    }
}