package FunctionLayer;

import java.util.HashMap;

public class CarportFlatRoof extends Carport {

    public CarportFlatRoof(int id, int orderId, int length, int width, int shed_length, int shed_width, HashMap<Integer, Materials> materialList) {
        super(id, orderId, length, width, shed_length, shed_width, materialList);
    }
}