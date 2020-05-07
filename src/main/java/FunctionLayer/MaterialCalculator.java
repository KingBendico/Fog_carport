package FunctionLayer;

import DBAccess.DataMapper;
import FunctionLayer.Materials;

import java.util.HashMap;

public class MaterialCalculator{


    public static HashMap MaterialList() throws LoginSampleException { //SKAL TAGE ET ORDRE OBJEKT SOM PARAMETRE?
        double length = 780;
        int width = 600;
        double area = length * width;
        int shed_length = 0;
        int shed_width = 0;
        boolean skur = true;

        HashMap<Integer, Materials> materials = LogicFacade.getMaterials();

        //Understernbrædder for og bag
        materials.get(1).setCount((int)Math.ceil((width/360.0)*2.0));

        //Understernbrædder til sider
        materials.get(2).setCount((int)Math.ceil((length/540.0)*2.0));

        //Oversternbrædder til forenden
        materials.get(3).setCount((int)Math.ceil(width/360.0));

        //Oversternbrædder til sider
        materials.get(4).setCount((int)Math.ceil((length/540.0)*2.0));

        //Remme i sider
        materials.get(8).setCount((int)Math.ceil((length/600.0)*2.0));

        //Stolper (Der skal være 310cm imellem hver stolpe)
        materials.get(11).setCount((int)Math.ceil((length/310.0)*2.0));

        //Vandbrædt på sider????

        //Vandbrædt i forende???


        //-----------FLADT TAG--------------
        //Spær
        int count = 0;
        for(int i = 0; i <=length;i=i+55){
            count++;
        }
        for(int i = 0; i<width;i=i+600){
            count = count * 2;
        }
        materials.get(10).setCount(count);

        //Tagplader
        int tag600 = 0;
        int tag360 = 0;
        int roofcount = (int) Math.ceil(width / 109);
        for(int i = 0; i<length;i=i+600){
            tag600 = tag600 + 1;
            if (length > i) {
                tag360 = tag360 + 1;
                i = i + 360;
            }
        }
        materials.get(15).setCount(tag600*roofcount);
        materials.get(16).setCount(tag360*roofcount);

        //-----------FLADT TAG------------


        //-------SKUR MATERIALER---------


        //Z til skurdør
        if(skur){
            materials.get(5).setCount(1);
        }
        //Løsholter til gavle på skur
        if(skur){
            materials.get(6).setCount(0); //???????
        }
        //Løsholter til sider på skur
        if(skur){
            materials.get(7).setCount(0); //???????
        }
        //Remme til skur del. Skal deles
        if(skur){
            materials.get(9).setCount(0); //???????
        }
        //Beklædning af skur
        if(skur) {
            materials.get(12).setCount(0); //????????
        }

        //--------SKUR MATERIALER---------


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