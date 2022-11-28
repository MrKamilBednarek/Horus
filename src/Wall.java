import Repository.Structure;
import model.Block;
import model.FullBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {

    private List<Block> blocks=new ArrayList<>();



    @Override
    public Optional<Block> findBlockByColor(String color) {
        Optional<Block> blockOptional= blocks.stream()
                .filter(f->f.getColor().equals(color))
                .findAny();
        return blockOptional;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blocksByMaterial=blocks.stream()
                .filter(f->f.getMaterial().equals(material))
                .collect(Collectors.toList());
        return blocksByMaterial;
    }

    @Override
    public int count() {
        try{
        return blocks.size();
        }
        catch (NullPointerException e){
            System.out.println("Size cannot be null");
        }
        return 0;
    }
    public void addBlock(String color,String material){
        FullBlock fullBlock=new FullBlock();
        fullBlock.setColor(color);
        fullBlock.setMaterial(material);
        blocks.add(fullBlock);
    }
}
