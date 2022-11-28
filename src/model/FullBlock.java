package model;

import java.util.List;

public class FullBlock implements CompositeBlock{
    private String color;
    private String material;

    public FullBlock (String color, String material){
        this.setColor(color);
        this.setMaterial(material);
    }
    public FullBlock(){

    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    public void setColor(String color) {
        this.color=color;

    }

    public void setMaterial(String material) {
        this.material=material;
    }

    @Override
    public List<Block> getBlocks() {
        return null;
    }
}
