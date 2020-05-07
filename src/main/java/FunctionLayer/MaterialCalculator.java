package FunctionLayer;

import FunctionLayer.Materials;

import java.util.HashMap;

public class MaterialCalculator{

    double length = 780;
    int width = 600;
    double area = length * width;
    int shed_length = 0;
    int shed_width = 0;
    boolean skur = true;

    public String MaterialList(){ //SKAL TAGE ET ORDRE OBJEKT SOM PARAMETRE?
        //Dummy list
        HashMap<Integer, Materials> mats = new HashMap<>();
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
        mats.put(1,m1);
        mats.put(2,m2);
        mats.put(3,m3);
        mats.put(4,m4);
        mats.put(5,m5);
        mats.put(6,m6);
        mats.put(7,m7);
        mats.put(8,m8);
        mats.put(9,m9);
        mats.put(10,m10);
        mats.put(11,m11);
        mats.put(12,m12);
        mats.put(13,m13);
        mats.put(14,m14);
        mats.put(15,m15);
        mats.put(16,m16);


        //Understernbrædder for og bag
        mats.get(1).setCount((int)Math.ceil((width/360.0)*2.0));

        //Understernbrædder til sider
        mats.get(2).setCount((int)Math.ceil((length/540.0)*2.0));

        //Oversternbrædder til forenden
        mats.get(3).setCount((int)Math.ceil(width/360.0));

        //Oversternbrædder til sider
        mats.get(4).setCount((int)Math.ceil((length/540.0)*2.0));

        //Remme i sider
        mats.get(8).setCount((int)Math.ceil((length/600.0)*2.0));

        //Stolper (Der skal være 310cm imellem hver stolpe)
        mats.get(11).setCount((int)Math.ceil((length/310.0)*2.0));

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
        mats.get(10).setCount(count);

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
        mats.get(15).setCount(tag600*roofcount);
        mats.get(16).setCount(tag360*roofcount);

        //-----------FLADT TAG------------


        //-------SKUR MATERIALER---------


        //Z til skurdør
        if(skur){
            mats.get(5).setCount(1);
        }
        //Løsholter til gavle på skur
        if(skur){
            mats.get(6).setCount(0); //???????
        }
        //Løsholter til sider på skur
        if(skur){
            mats.get(7).setCount(0); //???????
        }
        //Remme til skur del. Skal deles
        if(skur){
            mats.get(9).setCount(0); //???????
        }
        //Beklædning af skur
        if(skur) {
            mats.get(12).setCount(0); //????????
        }

        //--------SKUR MATERIALER---------


        return mats.toString();
    }
}