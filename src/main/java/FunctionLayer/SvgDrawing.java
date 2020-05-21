package FunctionLayer;

public class SvgDrawing {

    public static Svg drawMyCarport(Carport carport){
//        Svg svgFrame = new Svg(0,0,1000,1000,"0,0,1000,1000");
//        svgFrame.addFrame(); //1000 x 1000

        Svg svg = new Svg(0,0,carport.getWidth(),carport.getLength(),"0,0,800,800"); // Hvis viewbox < str på carport bliver den beskåret.
        // Jo større carport der vælges, des større bliver hele viewboxen. Jo mindre, desto mindre bliver viewboxen.

        // Diverse variabler
        int strapThickness = 4;     //4.5 som double ?
        int poleThickness = 10;
        int rafterThickness = 4;    //4.5 som double ?
        int rafterDistance = 55;
        int sternThickness = 2;

        // Remme / Strap
        svg.addStrap(0,35, strapThickness, carport.getLength());                     // x 0
        svg.addStrap(0,carport.getWidth()-35, strapThickness, carport.getLength());       // x carport.length

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

        // Stern /
        // Vandrette
        svg.addStern(0,0, sternThickness, carport.getLength());
        svg.addStern(0,carport.getWidth(), sternThickness, carport.getLength());
        // Lodrette
        svg.addStern(0,0, carport.getWidth(), sternThickness);
        svg.addStern(carport.getLength(),0, carport.getWidth(), sternThickness);

        // Stolper / Pole
        int poleX = (int)Math.round(carport.getLength()/10); //variabel

        // stolper til venstre
        svg.addPole(poleX, 32, poleThickness, poleThickness);
        svg.addPole(poleX, carport.getWidth() - 38, poleThickness, poleThickness);

        // stolper til højre
        svg.addPole(carport.getLength()-poleX, 32, poleThickness, poleThickness);
        svg.addPole(carport.getLength()-poleX, carport.getWidth() - 38, poleThickness, poleThickness);

        // midterstolpe, hvis nødvendigt..
        if(carport.getMaterialList().get(11).getCount() == 6){
            svg.addPole(carport.getLength()/2,32,poleThickness,poleThickness);
            svg.addPole(carport.getLength()/2,carport.getWidth() - 38,poleThickness,poleThickness);
        }

       // System.out.println(carport.getMaterialList().get(11).getCount());
       // request.setAttribute("svgdrawing", svg.toString());

        return svg;
    }
}


/*


 for(int i = 0; i < (carport.getMaterialList().get(11).getCount()/2)-4; i++){
            int temp = (((-poleX*2)+carport.getLength())/2);
            svg.addPole(temp,32,poleThickness,poleThickness);
            svg.addPole(temp,carport.getWidth() - 38,poleThickness,poleThickness);
        }


for(double j = poleX; j < carport.getLength(); j = j + 310){
                if (j > carport.getLength()-50){
                    j = carport.getLength()-50;
                }
                svg.addPole(j, 32, poleThickness, poleThickness);
                svg.addPole(j, carport.getWidth() - 38, poleThickness, poleThickness);
            }
 */