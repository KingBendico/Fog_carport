package FunctionLayer;

import java.util.HashMap;

public class MaterialCalculator{


    public static HashMap MaterialList(Carport carport) throws LoginSampleException {
        double length = carport.getLength();
        int width = carport.getWidth();
        double area = length * width;
        int shed_length = carport.getShed_length();
        int shed_width = carport.getShed_width();
        int slope = 0;
        boolean skur = false;
        boolean roofsloped = false;
        HashMap<Integer, Materials> materials = LogicFacade.getMaterials();

        //If til at sætte booleans
        if(shed_length>0){skur=true;}
        if(carport instanceof CarportRaisedRoof){
            slope = ((CarportRaisedRoof) carport).getRoofSlope();
            roofsloped = true;
        }

        //Understernbrædder for og bag
        materials.get(1).setCount((int)Math.ceil((width/360.0)*2.0));
      //  materials.get(1).setCount((int)Math.ceil((width/360.0)*2.0));

        //Understernbrædder til sider
        materials.get(2).setCount((int)Math.ceil((length/540.0)*2.0));

        //Oversternbrædder til forenden
        materials.get(3).setCount((int)Math.ceil(width/360.0));

        //Oversternbrædder til sider
        materials.get(4).setCount((int)Math.ceil((length/540.0)*2.0));

        //Remme i sider
        materials.get(8).setCount((int)Math.ceil((length/600.0)*2.0));

        //Stolper (Der skal være 310cm imellem hver stolpe
        materials.get(11).setCount(4);
        int distFromEnd = carport.getLength()/10;
        int spaceBetween = (carport.getLength()-(distFromEnd*2));
        for(int i = 310; i < spaceBetween; i = i + 310){    // rettet spaceBetween/2 til spaceBetween.
            materials.get(11).setCount(materials.get(11).getCount()+2);
        }

        //Vandbrædt på sider????

        //Vandbrædt i forende???


        //--------------TAGMATERIALER------------------

        if (roofsloped) {

            //-----------REJST TAG------------
            //Spær
            int count = 0;
            for (int i = 0; i <= length; i = i + 55) {
                count++;
            }
            for (int i = 0; i < width; i = i + 600) {
                count = count * 2;
            }
            materials.get(10).setCount(count);

            //Tagplader

            //pitch(rise) er taget fra en tabel. Udtryk for konstant på hældning. https://roof-stores.co.uk/calculating-amount-roof-tiles-slates
            double pitch = 0;
            if(slope == 15){
                pitch = 0.27;
            }else if(slope ==20){
                pitch = 0.36;
            }else if(slope == 30){
                pitch = 0.58;
            }else if(slope ==35){
                pitch = 0.70;
            }else if(slope == 40){
                pitch = 0.84;
            }else if(slope == 45){
                pitch = 1.0;
            }
            double roofSide = width/(2*pitch);

            int roof600sloped = 0;
            int roof360sloped = 0;
            int roofcountsloped = (int) Math.ceil(roofSide / 109);
            for(int i = 0; i<length;i=i+600){
                roof600sloped = roof600sloped + 1;
                if (length > i) {
                    roof360sloped = roof360sloped + 1;
                    i = i + 360;
                }
            }
            materials.get(15).setCount(roof600sloped*roofcountsloped);
            materials.get(16).setCount(roof360sloped*roofcountsloped);
        } else {

            //-----------FLADT TAG--------------
            //Spær
            int count = 0;
            for (int i = 0; i <= length; i = i + 55) {
                count++;
            }
            for (int i = 0; i < width; i = i + 600) {
                count = count * 2;
            }
            materials.get(10).setCount(count);

            //Tagplader
            int roof600 = 0;
            int roof360 = 0;
            int roofcount = (int) Math.ceil(width / 109);
            for (int i = 0; i < length; i = i + 600) {
                roof600 = roof600 + 1;
                if (length > i) {
                    roof360 = roof360 + 1;
                    i = i + 360;
                }
            }
            materials.get(15).setCount(roof600 * roofcount);
            materials.get(16).setCount(roof360 * roofcount);

        }

        //-------SKUR MATERIALER---------

        if(skur){
        //Z til skurdør
            materials.get(5).setCount(1);
        //Stolper (Der skal bruges flere stolper til skur)
            materials.get(11).setCount(materials.get(11).getCount()+4);
        //Løsholter til gavle på skur
            materials.get(6).setCount((int)Math.ceil(shed_width/270)*12);
        //Løsholter til sider på skur
            materials.get(7).setCount((int)Math.ceil(shed_length/240)*4);
        //Remme til skur del. Skal deles
            materials.get(9).setCount(1);
        //Beklædning af skur
            materials.get(12).setCount((int)Math.ceil((shed_length*2)+(shed_width*2)/10));
        }


        return materials;
    }
}

/*

    //Dummy list
    Materials m1 = new Materials(1, "Brædt", 360, 0, "Stk", "Understernbrædder for og bag");
    Materials m2 = new Materials(2, "Brædt", 540, 0, "Stk", "understernbrædder til sider");
    Materials m3 = new Materials(3, "Brædt", 360, 0, "Stk", "Overstern for");
    Materials m4 = new Materials(4, "Brædt", 540, 0, "Stk", "Overstern sider");
    Materials m5 = new Materials(5, "Lægte", 420, 0, "Stk", "til z på dør skur");
    Materials m6 = new Materials(5, "Reglar", 270, 0, "Stk", "Løsholter til skur gavl");
    Materials m7 = new Materials(5, "Reglar", 240, 0, "Stk", "Løsholter til skur sider");
    Materials m8 = new Materials(5, "Spærtræ", 600, 0, "Stk", "Remme i sider");
    Materials m9 = new Materials(5, "Spærtræ", 480, 0, "Stk", "Remme skur, deles");
    Materials m10 = new Materials(5, "Spærtræ", 600, 0, "Stk", "Spær");
    Materials m11 = new Materials(5, "Stolpe", 300, 0, "Stk", "Stolper nedgraves 90cm");
    Materials m12 = new Materials(5, "Brædt", 210, 0, "Stk", "Beklædning af skur");
    Materials m13 = new Materials(5, "Brædt", 540, 0, "Stk", "vandbrædt sider");
    Materials m14 = new Materials(5, "Brædt", 360, 0, "Stk", "vandbrædt forende");
    Materials m15 = new Materials(5, "PlastmoTag", 600, 0, "Stk", "tagplader");
    Materials m16 = new Materials(5, "PlastmoTag", 360, 0, "Stk", "tagplader");
        materials.put(1,m1);
                materials.put(2,m2);
                materials.put(3,m3);
                materials.put(4,m4);
                materials.put(5,m5);
                materials.put(6,m6);
                materials.put(7,m7);
                materials.put(8,m8);
                materials.put(9,m9);
                materials.put(10,m10);
                materials.put(11,m11);
                materials.put(12,m12);
                materials.put(13,m13);
                materials.put(14,m14);
                materials.put(15,m15);
                materials.put(16,m16);
*/