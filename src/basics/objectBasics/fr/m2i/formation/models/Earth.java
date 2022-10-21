package basics.objectBasics.fr.m2i.formation.models;

public class Earth {
    private static Earth earth;

    private int numberOfTrees;

    private Earth(int numberOfTrees) {
        this.numberOfTrees = numberOfTrees;
    }

    public static Earth getInstance(int numberOfTrees) {
        if(earth == null) {
            earth = new Earth(numberOfTrees);
        }
        return earth;
    }

    public int getNumberOfTrees() {
        return numberOfTrees;
    }

    public void setNumberOfTrees(int numberOfTrees) {
        this.numberOfTrees = numberOfTrees;
    }
}
