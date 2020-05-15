package FunctionLayer;

import java.util.HashMap;

public abstract class Carport {

    private int length;
    private int width;
    private int shed_length;
    private int shed_width;
    private HashMap<Integer, Materials> materialList;

    public Carport(int length, int width, int shed_length, int shed_width, HashMap<Integer, Materials> materialList) {
        this.length = length;
        this.width = width;
        this.shed_length = shed_length;
        this.shed_width = shed_width;
        this.materialList = materialList;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getShed_length() {
        return shed_length;
    }

    public void setShed_length(int shed_length) {
        this.shed_length = shed_length;
    }

    public int getShed_width() {
        return shed_width;
    }

    public void setShed_width(int shed_width) {
        this.shed_width = shed_width;
    }

    public HashMap<Integer, Materials> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(HashMap<Integer, Materials> materialList) {
        this.materialList = materialList;
    }
}
