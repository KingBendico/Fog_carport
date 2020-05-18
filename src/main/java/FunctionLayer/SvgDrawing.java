package FunctionLayer;

public class SvgDrawing {

    public static Svg drawMyCarport(Carport carport){
    //    Svg svgFrame = new Svg(0,0,1000,1000,"0,0,1000,1000");
    //    svgFrame.addFrame(); //1000 x 1000

        Svg svg = new Svg(0,0,carport.getWidth(),carport.getLength(),"0,0,800,800"); // Hvis viewbox < str på carport bliver den beskåret.
        // Jo større carport der vælges, des større bliver hele viewboxen. Jo mindre, desto mindre bliver viewboxen.

        // Diverse variabler
        int strapThickness = 4;     //4.5 som double ?
        int poleThickness = 10;
        int rafterThickness = 4;    //4.5 som double ?
        int rafterDistance = 55;

        // Remme / Strap
        svg.addStrap(0,0, strapThickness, carport.getLength());                     // x 0
        svg.addStrap(0,carport.getWidth(), strapThickness, carport.getLength());       // x carport.length

        // Spær / Rafter
        for(int i = 0; i < carport.getLength(); i = i + rafterDistance){
            svg.addRafter(i,0,carport.getWidth(), rafterThickness); // X SKAL ÆNDRES !!!!!!!!!!!!!!!
        }
        if(carport.getLength() != 330){
            svg.addRafter(carport.getLength(),0,carport.getWidth(), rafterThickness);
        }
        else if(carport.getLength() != 660){
            svg.addRafter(carport.getLength(),0,carport.getWidth(), rafterThickness);
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
