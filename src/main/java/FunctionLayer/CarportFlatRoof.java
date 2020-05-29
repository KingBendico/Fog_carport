package FunctionLayer;

import java.util.HashMap;

/**
 * The type Carport flat roof.
 */
public class CarportFlatRoof extends Carport {

    /**
     * Instantiates a new Carport flat roof.
     *
     * @param id           the id
     * @param orderId      the order id
     * @param length       the length
     * @param width        the width
     * @param shed_length  the shed length
     * @param shed_width   the shed width
     * @param materialList the material list
     */
    public CarportFlatRoof(int id, int orderId, int length, int width, int shed_length, int shed_width, HashMap<Integer, Materials> materialList) {
        super(id, orderId, length, width, shed_length, shed_width, materialList);
    }
}