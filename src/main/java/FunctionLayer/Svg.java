package FunctionLayer;

public class Svg {
    private int length; //width     (længde på carporten på x-aksen)
    private int height; //height    (bredde på carporten på y-aksen)
    private String viewBox;
    private int x;
    private int y;
    private StringBuilder svg = new StringBuilder();

    private final String headerTemplate = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" height=\"%s\" width=\"%s\" viewBox=\"%s\" preserveAspectRatio=\"xMinYMin\">";
    private final String frameTemplate = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"1000\" height=\"1000\" viewBox=\"%s\" preserveAspectRatio=\"xMinYMin meet\">";
    private final String rectTemplate = "<rect x=\"%d\" y=\"%d\" height=\"%d\" width=\"%d\" style=\"stroke:#000000; fill: #ffffff\" />";
    private final String strapTemplate = "<rect x=\"%d\" y=\"%d\" height=\"%d\" width=\"%d\" style=\"stroke:000000; fill: #ffffff\" />";


    public Svg(int length, int height, String viewBox, int x, int y) {
        this.length = length;
        this.height = height;
        this.viewBox = viewBox;
        this.x = x;
        this.y = y;
        svg.append(String.format(headerTemplate, length, height, viewBox));
    }

    public Svg() {
    }

    public void addRect(int x, int y, int length, int height){
        svg.append(String.format(rectTemplate, x, y, length, height));
    }

    public void addFrame(){
        svg.append(String.format(frameTemplate, viewBox));
    }

    public void addStrap(){
        svg.append(String.format(strapTemplate));
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getViewBox() {
        return viewBox;
    }

    public void setViewBox(String viewBox) {
        this.viewBox = viewBox;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return svg.toString() + "</svg>";
    }
}