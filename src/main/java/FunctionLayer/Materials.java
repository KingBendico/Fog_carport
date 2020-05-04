package FunctionLayer;

public class Materials {
    private int materialId;
    private String name;
    private int length;
    private int count;
    private String unit;
    private String description;

    public Materials(int materialId, String name, int length, int count, String unit, String description) {
        this.materialId = materialId;
        this.name = name;
        this.length = length;
        this.count = count;
        this.unit = unit;
        this.description = description;
    }

    public int getMaterialId(){
        return materialId;
    }

    public void setMaterialId(int materialId){
        this.materialId = materialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name + count;
    }
}