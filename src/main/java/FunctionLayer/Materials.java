package FunctionLayer;

/**
 * The type Materials.
 */
public class Materials {
    private int materialId;
    private String name;
    private int length;
    private int count;
    private String unit;
    private String description;
    private int price;

    /**
     * Instantiates a new Materials.
     *
     * @param materialId  the material id
     * @param name        the name
     * @param length      the length
     * @param count       the count
     * @param unit        the unit
     * @param description the description
     * @param price       the price
     */
    public Materials(int materialId, String name, int length, int count, String unit, String description, int price) {
        this.materialId = materialId;
        this.name = name;
        this.length = length;
        this.count = count;
        this.unit = unit;
        this.description = description;
        this.price = price;
    }

    /**
     * Gets material id.
     *
     * @return the material id
     */
    public int getMaterialId() {
        return materialId;
    }

    /**
     * Sets material id.
     *
     * @param materialId the material id
     */
    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
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
     * Gets count.
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets unit.
     *
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets unit.
     *
     * @param unit the unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return materialId + " " + name + " " + count + " " + unit;
    }
}