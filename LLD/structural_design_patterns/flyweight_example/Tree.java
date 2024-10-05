package structural_design_patterns.flyweight_example;

public class Tree {
    int x;
    int y;
    TreeType treeType;

    Tree(int x, int y, TreeType treeType){
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }
}
