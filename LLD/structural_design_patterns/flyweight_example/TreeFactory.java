package structural_design_patterns.flyweight_example;

import java.util.HashMap;
public class TreeFactory {
    static HashMap<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String type, String color, String texture){
        String key = type+"-"+color+"-"+texture;
        TreeType treeType = treeTypes.get(key); // if exists, no need to create new - thus saving memory
        if(treeType == null){
            //create new TreeType object
            treeType = new TreeType(type, color, texture);
            treeTypes.put(key, treeType); // add to map, so next time it may be used
        }
        return treeType;
    }   
}
