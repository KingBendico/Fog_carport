package FunctionLayer;

import java.util.HashMap;

/**
 * The type Carport.
 */
public abstract class Carport {

    private int id;
    private int orderId;
    private int length;
    private int width;
    private int shed_length;
    private int shed_width;
    private HashMap<Integer, Materials> materialList;

    /**
     * Instantiates a new Carport.
     *
     * @param id           the id
     * @param orderId      the order id
     * @param length       the length
     * @param width        the width
     * @param shed_length  the shed length
     * @param shed_width   the shed width
     * @param materialList the material list
     */
    public Carport(int id, int orderId, int length, int width, int shed_length, int shed_width, HashMap<Integer, Materials> materialList) {
        this.id = id;
        this.orderId = orderId;
        this.length = length;
        this.width = width;
        this.shed_length = shed_length;
        this.shed_width = shed_width;
        this.materialList = materialList;
    }

    /**
     * Create carport carport.
     *
     * @param id            the id
     * @param orderId       the order id
     * @param carportLength the carport length
     * @param carportWidth  the carport width
     * @param shedLength    the shed length
     * @param shedWidth     the shed width
     * @param roofPitch     the roof pitch
     * @return carport carport
     * @throws LoginSampleException the login sample exception
     */
    public static Carport createCarport(int id, int orderId, int carportLength, int carportWidth, int shedLength, int shedWidth, int roofPitch) throws LoginSampleException {
        Carport carport;
        if (roofPitch == 0) {
            if (shedLength == 0) {
                carport = new CarportFlatRoof(id, orderId, carportLength, carportWidth, 0, 0, new HashMap<>());
                carport.setMaterialList(MaterialCalculator.MaterialList(carport));
            } else {
                carport = new CarportFlatRoof(id, orderId, carportLength, carportWidth, shedLength, shedWidth, new HashMap<>());
                carport.setMaterialList(MaterialCalculator.MaterialList(carport));
            }
        } else {
            if (shedLength == 0) {
                carport = new CarportRaisedRoof(id, orderId, carportLength, carportWidth, 0, 0, new HashMap<>(), roofPitch);
                carport.setMaterialList(MaterialCalculator.MaterialList(carport));
            } else {
                carport = new CarportRaisedRoof(id, orderId, carportLength, carportWidth, shedLength, shedWidth, new HashMap<>(), roofPitch);
                carport.setMaterialList(MaterialCalculator.MaterialList(carport));
            }
        }
        return carport;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets length.
     *
     * @param length the length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets shed length.
     *
     * @return the shed length
     */
    public int getShed_length() {
        return shed_length;
    }

    /**
     * Sets shed length.
     *
     * @param shed_length the shed length
     */
    public void setShed_length(int shed_length) {
        this.shed_length = shed_length;
    }

    /**
     * Gets shed width.
     *
     * @return the shed width
     */
    public int getShed_width() {
        return shed_width;
    }

    /**
     * Sets shed width.
     *
     * @param shed_width the shed width
     */
    public void setShed_width(int shed_width) {
        this.shed_width = shed_width;
    }

    /**
     * Gets material list.
     *
     * @return the material list
     */
    public HashMap<Integer, Materials> getMaterialList() {
        return materialList;
    }

    /**
     * Sets material list.
     *
     * @param materialList the material list
     */
    public void setMaterialList(HashMap<Integer, Materials> materialList) {
        this.materialList = materialList;
    }

    @Override
    public String toString() {
        String constring = "";
        for (int i = 0; i < materialList.size(); i++) {
            if (materialList.get(i).getCount() > 0) {
                constring += materialList.get(i).getMaterialId() + ", " + materialList.get(i).getName() + ", " + materialList.get(i).getCount() + ",/n";
            }
        }
        return constring;
    }
}