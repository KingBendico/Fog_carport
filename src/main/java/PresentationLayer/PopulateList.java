package PresentationLayer;

/**
 * The type Populate list.
 */
public class PopulateList {

    private int id;
    private String name;

    /**
     * Instantiates a new Populate list.
     *
     * @param id   the id
     * @param name the name
     */
    public PopulateList(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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
}