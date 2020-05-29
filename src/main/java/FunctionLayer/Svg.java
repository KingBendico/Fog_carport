package FunctionLayer;

/**
 * The type Svg.
 */
public class Svg {
    private int x;
    private int y;
    private int length; //width     (længde på carporten på x-aksen)
    private int height; //height    (bredde på carporten på y-aksen)
    private String viewBox;
    private StringBuilder svg = new StringBuilder();

    private final String headerTemplate = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" height=\"%s\" width=\"%s\" viewBox=\"%s\" preserveAspectRatio=\"xMinYMin\">";
    private final String frameTemplate = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"1000\" height=\"1000\" viewBox=\"0,0,1000,1000\" preserveAspectRatio=\"xMinYMin meet\">";
    private final String rectTemplate = "<rect x=\"%d\" y=\"%d\" height=\"%d\" width=\"%d\" style=\"stroke:#000000; fill: #ffffff\" />";

    /**
     * Instantiates a new Svg.
     *
     * @param x       the x
     * @param y       the y
     * @param length  the length
     * @param height  the height
     * @param viewBox the view box
     */
    public Svg(int x, int y, int length, int height, String viewBox) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.height = height;
        this.viewBox = viewBox;
        svg.append(String.format(headerTemplate, length, height, viewBox));
    }

    /**
     * Add frame.
     */
    public void addFrame() {
        svg.append(String.format(frameTemplate, viewBox));
    }

    /**
     * Add strap.
     *
     * @param x      the x
     * @param y      the y
     * @param length the length
     * @param height the height
     */
    public void addStrap(int x, int y, int length, int height) {
        svg.append(String.format(rectTemplate, x, y, length, height));
    }

    /**
     * Add rafter.
     *
     * @param x      the x
     * @param y      the y
     * @param length the length
     * @param height the height
     */
    public void addRafter(int x, int y, int length, int height) {
        svg.append(String.format(rectTemplate, x, y, length, height));
    }

    /**
     * Add stern.
     *
     * @param x      the x
     * @param y      the y
     * @param length the length
     * @param height the height
     */
    public void addStern(int x, int y, int length, int height) {
        svg.append(String.format(rectTemplate, x, y, length, height));
    }

    /**
     * Add pole.
     *
     * @param x      the x
     * @param y      the y
     * @param length the length
     * @param height the height
     */
    public void addPole(int x, int y, int length, int height) {
        svg.append(String.format(rectTemplate, x, y, length, height));
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
     * Gets height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets view box.
     *
     * @return the view box
     */
    public String getViewBox() {
        return viewBox;
    }

    /**
     * Sets view box.
     *
     * @param viewBox the view box
     */
    public void setViewBox(String viewBox) {
        this.viewBox = viewBox;
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * Sets y.
     *
     * @param y the y
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return svg.toString() + "</svg>";
    }
}
