package FunctionLayer;

public class SvgDrawing {

    public static Svg drawMyCarport(Carport carport){
        Svg svgFrame = new Svg(0,0,carport.getLength(),carport.getWidth(),"0,0,800,600");
        //svgFrame.addFrame(); //1000 x 1000

        Svg svg = new Svg(0,0,carport.getLength(),carport.getWidth(),"0,0,900,800");

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

        //request.setAttribute("svgdrawing", svg.toString());

        return svg;
    }
}
