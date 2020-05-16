package FunctionLayer;

import java.util.HashMap;

public abstract class Carport {

    private int id;
    private int orderId;
    private int length;
    private int width;
    private int shed_length;
    private int shed_width;
    private HashMap<Integer, Materials> materialList;

    public Carport(int id, int orderId, int length, int width, int shed_length, int shed_width, HashMap<Integer, Materials> materialList) {
        this.id = id;
        this.orderId = orderId;
        this.length = length;
        this.width = width;
        this.shed_length = shed_length;
        this.shed_width = shed_width;
        this.materialList = materialList;
    }
    public int getId(){return id; }

    public void setId(int id){this.id = id;}

    public int getOrderId(){return orderId; }

    public void setOrderId(int orderId){this.orderId = orderId;}

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

    @Override
    public String toString() {
        String constring ="";
        for (int i = 0; i < materialList.size(); i++){
            constring += materialList.get(i).getName() + " " + materialList.get(i).getName() + "/n";
        }
        return constring;
    }
}
