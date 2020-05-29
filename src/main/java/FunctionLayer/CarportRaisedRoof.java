package FunctionLayer;

import java.util.HashMap;

/**
 * The type Carport raised roof.
 */
public class CarportRaisedRoof extends Carport {
    private int roofSlope;

    /**
     * Instantiates a new Carport raised roof.
     *
     * @param id           the id
     * @param orderId      the order id
     * @param legnth       the legnth
     * @param width        the width
     * @param shed_length  the shed length
     * @param shed_width   the shed width
     * @param materialList the material list
     * @param roofSlope    the roof slope
     */
    public CarportRaisedRoof(int id, int orderId, int legnth, int width, int shed_length, int shed_width, HashMap<Integer, Materials> materialList, int roofSlope) {
        super(id, orderId, legnth, width, shed_length, shed_width, materialList);
        this.roofSlope = roofSlope;
    }

    /**
     * Gets roof slope.
     *
     * @return the roof slope
     */
    public int getRoofSlope() {
        return roofSlope;
    }

    /**
     * Sets roof slope.
     *
     * @param roofSlope the roof slope
     */
    public void setRoofSlope(int roofSlope) {
        this.roofSlope = roofSlope;
    }
}