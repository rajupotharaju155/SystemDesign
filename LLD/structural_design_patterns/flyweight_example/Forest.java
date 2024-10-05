package structural_design_patterns.flyweight_example;
import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<Tree> trees = new ArrayList<>();
    void plantTree(int x, int y, String type, String color, String texture){
        //Below step will get existing object (for common properties) if exists else create new Treetype - thus saving memory
        TreeType treeType = TreeFactory.getTreeType(type, color, texture); 
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    void displayTrees(){
        for(Tree tree : trees){
            System.out.println(tree+" - "+tree.treeType);
        }
    }

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 2, "OAK", "GREEN", "ROUGH");
        forest.plantTree(1, 2, "Pine", "GREEN", "ROUGH");
        forest.plantTree(1, 2, "Neem", "YELLOW", "SMOOTH");
        forest.plantTree(1, 2, "OAK", "GREEN", "ROUGH");
        forest.plantTree(1, 2, "OAK", "GREEN", "ROUGH");

        forest.displayTrees();
    }
}
