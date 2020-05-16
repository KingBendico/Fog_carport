package FunctionLayer;

import java.util.HashMap;

public class CarportRaisedRoof extends Carport {
    private int roofSlope;


    public CarportRaisedRoof(int id, int orderId, int legnth, int width, int shed_length, int shed_width, HashMap<Integer, Materials> materialList, int roofSlope) {
        super(id , orderId, legnth, width, shed_length, shed_width, materialList);
        this.roofSlope = roofSlope;
    }

    public int getRoofSlope() {
        return roofSlope;
    }

    public void setRoofSlope(int roofSlope) {
        this.roofSlope = roofSlope;
    }
}
